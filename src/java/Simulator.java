
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
            Simulation.currentTime = ev.getTime();
            if ( ev.getType() == 0 ){ // Start
                for(Node node : Simulation.network) {
                    node.start();
                }
            }
            if ( ev.getType() == 1 ){ // Service begins
                double newTime = ev.getTime() + ev.getServer().dist.getRand();
                ev.getNode().removeFromQueue(ev.getCustomer());
                ev.getCustomer().startServing(ev.getTime());
                ev.getServer().empty = false;
                Simulation.addEvent(new Event(newTime, 2, ev.getNode(), ev.getCustomer(), ev.getServer()));
            }
            if ( ev.getType() == 2 ){ // Service ends
                ev.getServer().empty = true;
            }
            if ( ev.getType() == 3 ){ // Arrival
                ev.getNode().addToQueue(ev.getCustomer());
            }
            if ( ev.getType() == 4 ){ // End
                break;
            }
        }
    }
    public void simulate(String code) {
        if ( !compile(code) ) return;
        System.out.println("Numero de nodos " + Simulation.numberOfNodes);
       // runSimulation();        
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
    public String getError(){
        return error;
    }
}

