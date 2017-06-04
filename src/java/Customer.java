/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dicr1
 */
public class Customer {
    public double queuing_time;
    public double service_time;
    public int id;
    public double startQueuing, startServing;
    public static int AUTO_ID = 0;
    
    public Customer(){
        queuing_time = 0;
        service_time = 0;
        id = AUTO_ID ++;
        Simulation.people.add(this);
    }
    
    public void startQueuing(double time) {
        startQueuing = time;
    }
    
    public void startServing(double time) {
        startServing = time;
        startQueuing = -1;
    }
    
    public void finishServing(double time) {
        service_time += time - startServing;
        startServing = -1;
    }
    
    public double getTiempoTotal(){
        return queuing_time + service_time;
    }
}
