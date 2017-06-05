/**
 * Created by afmesag on 04.06.17.
 */
var nodesArray = [];
var edgesArray = [];
var currentLine = 0;
var response;
var rawFile = new XMLHttpRequest();
rawFile.open('GET', 'in', false);
rawFile.onreadystatechange = function() {
  if (rawFile.readyState === 4) {
    if (rawFile.status === 200 || rawFile.status == 0) {
      // Read file's text, split with breakline
      response = rawFile.responseText.split('\n');
      // Current line
      var numNodes = parseInt(response[currentLine]);
      currentLine++;
      // Adding nodes and node's queues
      for (var i = 1; i <= numNodes; i++) {
        nodesArray.push({data: {id: 'qn' + i, count: 0}});
        nodesArray.push({data: {id: 'n' + i}});
      }
      // Adding end system node
      nodesArray.push({data: {id: 'end', count: 0}});
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
        var end = true;
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
            end = false;
          }
        }
        // If there's no connexion, then node is the end of the system
        if (end) {
          source = 'n' + i;
          edgesArray.push({data: {id: source + 'end', source: source, target: 'end'}});
        }
      }
    }
  }
}
rawFile.send(null);
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
        hide: false,
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
          addQTip('q' + node);
          cy.$('#' + line[1]).data().count++;
          cy.$('#' + line[1]).addClass('busy');
          addQTip(line[1]);
          break;
        case 'e2':
          cy.$('#' + line[1]).data().count--;
          cy.$('#' + line[1]).removeClass('busy');
          addQTip(line[1]);
          break;
        case 'e3':
          if (line[1] !== 'end') {
            cy.$('#q' + line[1]).data().count++;
            addQTip('q' + line[1]);
          }
          else {
            cy.$('#' + line[1]).data().count++;
            addQTip(line[1]);
          }
          break;
      }
    }
    currentLine++;
    setTimeout(readSimulationLine, 1000);
  }
}
// Add message to queues
addQTip("q");
// Add message to servers
addQTip("s");
addQTip("end");
readSimulationLine();