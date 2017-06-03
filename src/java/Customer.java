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
    public int queuing_time;
    public int service_time;
    public int id;
    public static int AUTO_ID = 0;
    
    public Customer(){
        queuing_time = 0;
        service_time = 0;
        id = AUTO_ID ++;
    }
    
    public int getTiempoTotal(){
        return queuing_time + service_time;
    }
}
