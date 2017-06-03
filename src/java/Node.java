
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dicr1
 */

public class Node {
    public int ID;
    public Distribution serverDistribution, queueDistribution;
    public ArrayList<Customer> queue;
    public ArrayList<Server> servers;
    public Node(){
        queue = new ArrayList<>();
        queueDistribution = null;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Distribution getServerDistribution() {
        return serverDistribution;
    }

    public void setServerDistribution(Distribution dist) {
        this.serverDistribution = dist;
    }

    public Distribution getQueueDistribution() {
        return queueDistribution;
    }

    public void setQueueDistribution(Distribution dist) {
        this.queueDistribution = dist;
    }

    public ArrayList<Customer> getQueue() {
        return queue;
    }

    public void setQueue(int numberOfCustomers) {
        for ( int i = 0; i < numberOfCustomers; i ++ ) {
            queue.add(new Customer());
        }
    }

    public ArrayList<Server> getServers() {
        return servers;
    }

    public void setServers(ArrayList<Server> servers) {
        this.servers = servers;
    }
    
    public int getNumberOfServers(){
        return servers.size();
    }
}
