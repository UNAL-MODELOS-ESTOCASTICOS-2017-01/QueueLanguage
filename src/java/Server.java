/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dicr1
 */
public class Server {
    public Distribution dist;
    public double a, b, lambda;
    public boolean empty;
    public double timeInService;
    
    public Server(Distribution d) {
        dist = d;
        empty = true;
    }
    
    public boolean isEmpty(){
        return empty;
    }
}
