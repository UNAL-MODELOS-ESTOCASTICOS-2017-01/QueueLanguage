
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
    public int numberOfServers;
    public Distribution serverDistribution, queueDistribution;
    public ArrayList<Customer> queue;
    public ArrayList<Server> servers;
    public Node(){
        queue = new ArrayList<>();
        queueDistribution = null;
    }
    
    public void start(){
        servers = new ArrayList<>();
        for(int i = 0; i < numberOfServers; i ++ ) {
            servers.add(new Server(serverDistribution,Simulation.search(ID),i));
        }
        if (queueDistribution != null) {
            queueDistribution.generateArrivals(this);
        }
    }
    
    public void removeFromQueue(Customer c) {
        queue.remove(c);
        c.queuing_time += Simulation.currentTime - c.startQueuing;
        c.startQueuing = -1;
    }
    
    public void addToQueue(Customer c) {
        c.startQueuing = Simulation.currentTime;
        queue.add(c);
    }
    
    public void callNextCustomer(){
        if ( queue.isEmpty() ) return;
        for(Server s : servers){
            if (s.isEmpty()){
                Simulation.addEvent(new Event(Simulation.currentTime, 1, this, queue.get(0), s));
                return;
            }
        }
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
            Simulation.addEvent(new Event(0, 3, this, new Customer(), null));
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

    public void setNumberOfServers(int numberOfServers) {
        this.numberOfServers = numberOfServers;
    }
    
}
