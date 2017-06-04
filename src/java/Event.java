/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dicr1
 */
public class Event {
    private double time;
    // type 0: Start
    // type 1: Service begins
    // type 2: Service ends
    // type 3: Arrival
    // type 4: End
    private int type;
    private Node node;
    private Customer customer;
    private Server server;
    public Event(double t, int type) {
        this.type = type;
        this.time = t;
    }
    public Event(double t, int type, Node n, Customer c, Server s){
        time = t;
        node = n;
        customer = c;
        server = s;
        this.type = type;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Server getServer() {
        return server;
    }

    public void setServer(Server server) {
        this.server = server;
    }
    
}
