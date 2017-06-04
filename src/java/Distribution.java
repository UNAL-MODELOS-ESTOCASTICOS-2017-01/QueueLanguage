/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dicr1
 */
public class Distribution {
    double a, b, lambda;
    public Distribution(double l) {
        this.lambda = l;
        a = b = -1;
    }
    public Distribution(double a, double b){
        this.a = a;
        this.b = b;
        lambda = -1;
    }
    public Distribution(String x, String y) {
        this(Double.parseDouble(x), Double.parseDouble(y));
    }
    public Distribution(String x) {
        this(Double.parseDouble(x));
    }
    
    public double getRand(){
        if ( lambda == -1 ) {
            return Util.getUniform(a, b);
        } else {
            return Util.getPoisson(lambda);
        }
    }
    
    public void generateArrivals(Node n) {
        double time = this.getRand();
        while ( time < Simulation.simulationTime ) {
            Simulation.addEvent(new Event(time, 3, n, new Customer(), null));
            time += this.getRand();
        }
    }
}
