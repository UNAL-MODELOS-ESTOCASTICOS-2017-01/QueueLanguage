
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
        
        while ( true ) {
            Event ev = Simulation.getNextEvent();
            if ( ev.getType() == 0 ){ // Start
                
            }
            if ( ev.getType() == 1 ){ // Service begins
                
            }
            if ( ev.getType() == 2 ){ // Service ends
                
            }
            if ( ev.getType() == 3 ){ // Arrival
                
            }
            if ( ev.getType() == 4 ){ // End
                
            }
        }
    }
    public void simulate(String code) {
        if ( !compile(code) ) return;
        System.out.println("Numero de nodos " + Simulation.numberOfNodes);
       // runSimulation();        
    }   
    public double getL(){
        return rand.nextDouble();
    }
    public double getLQ(){
        return rand.nextDouble();
    }
    public double getW(){
        return rand.nextDouble();
    }
    public double getWQ(){
        return rand.nextDouble();
    }
    public String getError(){
        return error;
    }
}

