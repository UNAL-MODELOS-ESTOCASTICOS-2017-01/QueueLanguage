
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dicr1
 */
public class Simulation {
    private Random rand = new Random();
    public static int numberOfNodes;
    public static int simulationTime;
    public static double currentTime;
    public static ArrayList<Node> network;
    public static PriorityQueue<Event> Q;
    public static ArrayList<Event> history;
    public static ArrayList<Customer> people;
    public static double[][] matrix;
    public static int from, to;
    public static double prob;
    public static double L, LQ, W, WQ;
    
    public static void init(){
        network = new ArrayList<>();
        matrix = new double[numberOfNodes + 2][numberOfNodes + 2];
        Q = new PriorityQueue<Event>(100, (Event e1, Event e2) -> {
            if ( e1.getTime() < e2.getTime() ) return 1;
            if ( e1.getTime() > e2.getTime() ) return -1;
            if ( e1.getType() < e2.getType() ) return 1;
            return -1;
        });
        history = new ArrayList<>();
        people = new ArrayList<>();
    }
    
    public static void addEvent(Event v){
        Q.add(v);
    }
    
    public static Event getNextEvent(){
        if ( Q.peek() != null ) {
            history.add(Q.peek());
        }
        return Q.poll();
    }
    
    public static Node getLast(){
        if (network.isEmpty()) return null;
        return network.get(network.size()-1);
    }
    
    public static void restartConnection() {
        from = -1;
        to = -1;
        prob = 0.0;
    }
    
    public static void createConnection(){
        matrix[from][to] = prob;
    }
    
    public static int search(int ID) {
        for ( int i = 0; i < network.size(); i ++ ) {
            if ( network.get(i).ID == ID )
                return i;
        }
        return -1;
    }
}
