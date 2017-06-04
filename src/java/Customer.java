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
        startQueuing = startServing = -1;
        Simulation.people.add(this);
    }
    
    public double getTotalTime(){
        return queuing_time + service_time;
    }
}
