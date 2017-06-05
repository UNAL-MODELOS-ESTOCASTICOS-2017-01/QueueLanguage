/**
 * Created by afmesag on 04.06.17.
 */
var nodesArray = [];
var edgesArray = [];
var currentLine = 0;
var startLine;
var response;
function start() {
  $("#startButton").prop("disabled",true);
  $("#uploadFile").prop("disabled",true);
  currentLine=startLine;
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
      .selector('.busy')
      .css({
        'background-color': '#ff0000'
      })
      .selector('.qbusy')
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
  var addQTip = function(selector) {
    cy.nodes('[id*="' + selector + '"]').each(function(value) {
      value.qtip({
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
          case 'e1':
            var node = line[1].substr(0, line[1].indexOf('s'));
            cy.$('#q' + node).data().count--;
            if (cy.$('#q' + node).data().count === 0)
              cy.$('#q' + node).removeClass('qbusy');
            addQTip('q' + node);
            cy.$('#' + line[1]).data().count++;
            cy.$('#' + line[1]).addClass('busy');
            break;
          case 'e2':
            cy.$('#' + line[1]).data().count--;
            cy.$('#' + line[1]).removeClass('busy');
            break;
          case 'e3':
            cy.$('#q' + line[1]).data().count++;
            cy.$('#q' + line[1]).addClass('qbusy');
            addQTip('q' + line[1]);
            break;
        }
      }
      currentLine++;
      setTimeout(readSimulationLine, 1000);
    }
    else{
      $("#startButton").prop("disabled",false);
      $("#uploadFile").prop("disabled",false);
    }
  }
  // Add message to queues
  addQTip("q");
  readSimulationLine();
}
function addFile(e) {
  var file = $("#uploadFile")[0].files[0];
  if(file==='')
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
      var connexions = response[i + currentLine - 1].split(' ');
      currentLine++;
      for (var j = 1; j <= connexions.length; j++) {
        /* Adding edges (connexions)
         if [i,j] then connexion between node-i and node-j
         */
        if (connexions[j - 1] === '1') {
          source = 'n' + i;
          target = 'qn' + j;
          edgesArray.push({data: {id: source + target, source: source, target: target}});
        }
      }
    }
    startLine=currentLine;
    $("#startButton").prop("disabled",false);
  }
  reader.readAsBinaryString(file);

}