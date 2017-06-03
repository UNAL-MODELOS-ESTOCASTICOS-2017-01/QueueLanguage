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
    private long time;
    // type 0: Start
    // type 1: Service begins
    // type 2: Service ends
    // type 3: Arrival
    // type 4: End
    private int type;
    private Node node;
    private Customer customer;
    private Server server;
    public Event(long t, Node n, Customer c, Server s){
        time = t;
        node = n;
        customer = c;
        server = s;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
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
