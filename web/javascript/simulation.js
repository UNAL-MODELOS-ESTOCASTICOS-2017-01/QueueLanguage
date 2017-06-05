/**
 * Created by afmesag on 04.06.17.
 */
var nodesArray = [];
var edgesArray = [];
var currentLine = 0;
var response;
function start() {
  // Block buttons when the simulation starts
  $("#startButton").prop("disabled", true);
  $("#uploadFile").prop("disabled", true);
  var cy = cytoscape({
    container: document.getElementById('cy'),
    boxSelectionEnabled: false,
    autounselectify: true,

    style: cytoscape.stylesheet()
      .selector('node')
      .css({
        'content': 'data(id)'
      })
      .selector('edge')
      .css({
        'curve-style': 'bezier',
        'target-arrow-shape': 'triangle',
        'width': 4,
        'line-color': '#ddd',
        'target-arrow-color': '#ddd'
      })
      .selector('.busy') // Busy server
      .css({
        'background-color': '#ff0000'
      })
      .selector('.qbusy') // Busy queue
      .css({
        'background-color': '#00ff00'
      }),

    elements: {
      nodes: nodesArray,
      edges: edgesArray
    },

    layout: {
      name: 'breadthfirst',
      directed: true,
      roots: '#qn1',
      padding: 10
    }
  });
  // Function to add message to a node
  var addQTip = function(selector) {
    cy.nodes('[id*="' + selector + '"]').each(function(value) {
      value.qtip({
          // Content of the message
          content: 'Count: ' + value.data().count,
          position: {
            my: 'top center',
            at: 'bottom center'
          },
          style: {
            classes: 'qtip-bootstrap',
            tip: {
              width: 16,
              height: 8
            }
          }
        }
      );
    });
  };
  // Read a line of the input
  var readSimulationLine = function() {
    if (currentLine < response.length) {
      var line = response[currentLine];
      // Time line
      if (line.indexOf(' ') === -1) {
        $("#time").text("Tiempo: " + line);
      } else {
        line = line.split(' ');
        // Type event
        switch (line[0]) {
          // Server occupied
          case 'e1':
            var node = line[1].substr(0, line[1].indexOf('s'));
            // Node's queue has one less element
            cy.$('#q' + node).data().count--;
            // If the node's queue count is 0, then the node's queue is free
            if (cy.$('#q' + node).data().count === 0)
              cy.$('#q' + node).removeClass('qbusy');
            // Change the message of the node's queue
            addQTip('q' + node);
            // Now the server is occopied
            cy.$('#' + line[1]).data().count++;
            cy.$('#' + line[1]).addClass('busy');
            break;
          case 'e2':
            // Now the server is free
            cy.$('#' + line[1]).data().count--;
            cy.$('#' + line[1]).removeClass('busy');
            break;
          case 'e3':
            // A new element has arrived to the node's queue
            cy.$('#q' + line[1]).data().count++;
            cy.$('#q' + line[1]).addClass('qbusy');
            // Update the message of the node's queue
            addQTip('q' + line[1]);
            break;
        }
      }
      // Change of line
      currentLine++;
      setTimeout(readSimulationLine, 1000);
    }
    else {
      // When the simulation is over, the buttons are re-activated
      $("#startButton").prop("disabled", false);
      $("#uploadFile").prop("disabled", false);
    }
  }
  // Add message to queues
  addQTip("q");
  readSimulationLine();
}
function addFile(e) {
  var file = $("#uploadFile")[0].files[0];
  if (file === '')
    return;
  var reader = new FileReader();
  reader.onload = function(e) {
    // Read file's text, split with breakline
    response = reader.result.split('\n');
    // Current line
    var numNodes = parseInt(response[currentLine]);
    currentLine++;
    // Adding nodes and node's queues
    for (var i = 1; i <= numNodes; i++) {
      nodesArray.push({data: {id: 'qn' + i, count: 0}});
      nodesArray.push({data: {id: 'n' + i}});
    }
    // Adding node's servers
    var servers = response[currentLine].split(' ');
    currentLine++;
    for (var i = 1; i <= servers.length; i++) {
      for (var j = 1; j <= servers[i - 1]; j++) {
        nodesArray.push({data: {id: 'n' + i + 's' + j, parent: 'n' + i, count: 0}});
      }
    }
    // Matrix from servers per node
    for (var i = 1; i <= numNodes; i++) {
      var source = 'qn' + i;
      var target = 'n' + i;
      // Adding connexion between node and node's queue
      edgesArray.push({data: {id: source + target, source: source, target: target}});
      var connexions = response[currentLine].split(' ');
      currentLine++;
      for (var j = 1; j <= connexions.length; j++) {
        /* Adding edges (connexions)
         if [i,j] then connexion between node-i and node-j
         */
        if (connexions[j - 1].indexOf("1") !== -1) {
          source = 'n' + i;
          target = 'qn' + j;
          edgesArray.push({data: {id: source + target, source: source, target: target}});
        }
      }
    }
    $("#startButton").prop("disabled", false);
  }
  reader.readAsBinaryString(file);
}