                    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.LinkedList;

/**
 *
 * @author Miłosz
 */
class Cannon {
    boolean loaded = false;
    static int cannonNumber = 0;
    
    public Cannon(boolean loaded){
        this.loaded = loaded;
}
    
    public void fire(){
        if(loaded){
            cannonNumber++;            
            System.out.println("Oopsie! Sorry :/");
        } else{
            cannonNumber++;
            System.out.println("Załaduj aramtę nr " + cannonNumber + " !");
            loaded = true;
            } 
        }
                
}

class Program {
    public static void main(String[] args){
       
        LinkedList<Cannon> cannons = new LinkedList<Cannon>();
        
        Cannon cannon1 = new Cannon(false);
        Cannon cannon2 = new Cannon(false);
        Cannon cannon3 = new Cannon(false);
        Cannon cannon4 = new Cannon(false);
        Cannon cannon5 = new Cannon(true);
        Cannon cannon6 = new Cannon(false);
        
        cannons.add(cannon1);
        cannons.add(cannon2);
        cannons.add(cannon3);
        cannons.add(cannon4);
        cannons.add(cannon5);
        cannons.add(cannon6);
        
        for(Cannon c : cannons){
            c.fire();
        }
    }
}
