
import java.util.Arrays;
import java.util.Random;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dicr1
 */
class Simulator {
    
    private final Random rand = new Random();
    private String error;
    private boolean compile(String code){
        ANTLRInputStream input = new ANTLRInputStream(code);
        QueuingTLexer lexer = new QueuingTLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QueuingTParser parser = new QueuingTParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(ThrowingErrorListener.INSTANCE);
        ParseTree tree;
        try{
            tree = parser.codigo(); // begin parsing at rule 'codigo'
        } catch(Exception e) {
            error = e.getMessage();
            return false;
        }
        
        QueuingLanguageVisitor visitor = new QueuingLanguageVisitor();
        System.out.println("Hola");
        visitor.visit(tree);
        System.out.println("Adios");
        System.out.println(tree.toStringTree(parser)); // print LISP-style tree
        error = "Successful compilation";
        return true;
    }
    private void runSimulation() {
        Simulation.addEvent(new Event(Simulation.simulationTime, 4));
        Simulation.addEvent(new Event(0, 0));
        while ( true ) {
            Event ev = Simulation.getNextEvent();
            //System.out.println("Event time " + ev.getTime());
            Simulation.currentTime = ev.getTime();
            if ( ev.getType() == 0 ){ // Start
                for(Node node : Simulation.network) {
                    node.start();
                }
            }
            if ( ev.getType() == 1 ){ // Service begins
                double newTime = ev.getTime() + ev.getServer().dist.getRand();
                ev.getNode().removeFromQueue(ev.getCustomer());
                ev.getCustomer().startServing = ev.getTime();
                ev.getServer().startTime = ev.getTime();
                ev.getServer().empty = false;
                Simulation.addEvent(new Event(newTime, 2, ev.getNode(), ev.getCustomer(), ev.getServer()));
            }
            if ( ev.getType() == 2 ){ // Service ends
                ev.getServer().empty = true;
                ev.getNode().callNextCustomer();
                decideCustomerFuture(ev);
            }
            if ( ev.getType() == 3 ){ // Arrival
                ev.getNode().addToQueue(ev.getCustomer());
                ev.getNode().callNextCustomer();
            }
            if ( ev.getType() == 4 ){ // End
                closeCustomers();
                closeServers();
                calcStandings();
                break;
            }
        }
    }
    public void simulate(String code) {
        if ( !compile(code) ) return;
        // YA esta el objeto simulacion armado
        //printStructure();
        System.out.println("Numero de nodos " + Simulation.numberOfNodes);
        runSimulation();        
    } 
    public void printStructure()
    {
        System.out.println("------------------------------------------------------");  
        System.out.println("Numbers of nodes: "+Simulation.numberOfNodes);  
        System.out.println("Simulation time: "+Simulation.simulationTime);
        
        for( int i = 0; i < Simulation.numberOfNodes; i++ )
        {
             System.out.println("node :"+Simulation.network.get(i).ID);
         //   System.out.println("queue distribution (a, b, lambda) : "+Simulation.network.get(i).queueDistribution.a+" "+Simulation.network.get(i).queueDistribution.b+" "+Simulation.network.get(i).queueDistribution.lambda);
         //   System.out.println("server distribution (a, b, lambda) : "+Simulation.network.get(i).serverDistribution.a+" "+Simulation.network.get(i).serverDistribution.b+" "+Simulation.network.get(i).serverDistribution.lambda);
             System.out.println("customer in queue: "+Simulation.network.get(i).queue.size());
             System.out.println("number of servers: "+Simulation.network.get(i).servers.size());
             System.out.println();        
        }
        System.out.println("Probability matrix");
        for( int i = 0; i < Simulation.matrix.length; i++  )
        {
            System.out.println(Arrays.toString(Simulation.matrix[i]));
        }
        System.out.println("------------------------------------------------------");  
        
    }
    public void decideCustomerFuture(Event ev) {
        Customer c = ev.getCustomer();
        c.service_time += Simulation.currentTime - c.startServing;
        c.startServing = -1;
        int u = Simulation.search(ev.getNode().getID()), v = -1;
        double r = Util.getUniform(), acc = 0;
        for ( int i = 0; i < Simulation.numberOfNodes; i ++ ) {
            acc += Simulation.matrix[u][i];
            if ( acc > r ) { // Go to node i
                v = i;
                break;
            }
        }
        if ( v == -1 ) {
            // Customer leaves the system
        } else {
            Simulation.addEvent(new Event(
                    Simulation.currentTime,
                    3,
                    Simulation.network.get(v),
                    c, 
                    null));
        }
    }
    public void closeCustomers(){
        for(Customer c : Simulation.people){
            if ( c.startQueuing >= 0 )
                c.queuing_time += Simulation.simulationTime - c.startQueuing;
            if ( c.startServing >= 0 )
                c.service_time += Simulation.simulationTime - c.startServing;
        }
    }
    public void closeServers(){
        for(Node n : Simulation.network) {
            for(Server s: n.servers) {
                if(!s.isEmpty())
                    s.timeInService += Simulation.simulationTime - s.startTime;
            }
        }
    }
    public void calcStandings(){
        double totalTime = 0, queuingTime = 0, serviceTime = 0;
        System.out.println("Total de customers " + Simulation.people.size());
        for ( Customer c : Simulation.people) {
            if (c.getTotalTime()>Simulation.simulationTime){
                System.out.println("Historial customer " + c.id);
                for (Event ev : Simulation.history) {
                    if ( ev.getCustomer() == c ) {
                        System.out.println(ev.getTime() + " tipo " + ev.getType() + " en el nodo " + ev.getNode().ID + " tt = " + c.getTotalTime());
                    }
                }
            }
            totalTime += c.getTotalTime();
            queuingTime += c.queuing_time;
        }
        Simulation.L = totalTime / Simulation.simulationTime;
        Simulation.LQ = queuingTime / Simulation.simulationTime;
        Simulation.W = totalTime / Simulation.people.size();
        Simulation.WQ = queuingTime / Simulation.people.size();
        int nServers = 0;
        for ( Node n : Simulation.network ) {
            for ( Server s : n.servers ) {
                serviceTime += s.timeInService;
                nServers ++;
            }
        }
        Simulation.usage = serviceTime / (Simulation.simulationTime * nServers);
    }
    public double getL(){
        return Simulation.L;
    }
    public double getLQ(){
        return Simulation.LQ;
    }
    public double getW(){
        return Simulation.W;
    }
    public double getWQ(){
        return Simulation.WQ;
    }
    public double getUsage(){
        return Simulation.usage;
    }
    public String getError(){
        return error;
    }
}

