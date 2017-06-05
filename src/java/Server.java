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
    public boolean empty;
    public double startTime;
    public double timeInService;
    public String id;
    
    public Server(Distribution d, int node, int pos) {
        dist = d;
        empty = true;
        startTime = -1;
        id = "n"+Integer.toString(node)+"s"+Integer.toString(pos+1);
        System.out.println("id " + id);
    }
    
    public boolean isEmpty(){
        return empty;
    }
}
