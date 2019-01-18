
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.LinkedList;


/**
 *
 * @author Miłosz
 */
class Clock {
    int h;
    int m;
    int s;

    public Clock(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }
   
    
    public int getHour(){
       return h;
    }
    
    public int getMinute(){
       return m;
    }
    
    public int getSeconds(){
       return s;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void setM(int m) {
        this.m = m;
    }

    public void setS(int s) {
        this.s = s;
    }
    
    
    
    public String toString(){
        return "Time: " + h + ":" + m + ":" + s + " s";
    }
}




class Program2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       

        
        Clock clock1 = new Clock(1,2,30);
        Clock clock2 = new Clock(12, 5, 5);
        Clock clock3 = new Clock(2, 45, 27);
        Clock clock4 = new Clock(21, 26, 56);
        Clock clock5 = new Clock(23, 30, 30);
                
        LinkedList<Clock> clockList = new LinkedList<Clock>();
        clockList.add(clock5);
        clockList.add(clock4);
        clockList.add(clock3);
        clockList.add(clock2);
        clockList.add(clock1);
       
        
        for(Clock c : clockList) {
            System.out.println(c.toString());
            c.setH(c.getHour()+5);
            System.out.println(c.toString());
        }
   
   
        
    }
    
}

// How to set time hour and change it with 24h clock ie. 23h2m:30s + 2h = 01h:2m:30s