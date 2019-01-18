/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.*;

/**
 *
 * @author Miłosz
 */
public class SumRacing {
    
    public static void main(String[] args) {
        int sumaA = 1000;
        int sumaB = 10;
        Random  random = new Random();
        int tryCounter = 0;
       
        while (sumaA > sumaB){
            tryCounter++;
            int randomForA = random.nextInt(10);
            int randomForB = random.nextInt(50);
            sumaA = sumaA + randomForA;
            sumaB = sumaB + randomForB;
            System.out.println("Próba nr: " + tryCounter + "\n" +
                               "Suma A: " + sumaA +
                               "\nSuma B: " + sumaB);
            System.out.println("");
           }                
        }
  
}
