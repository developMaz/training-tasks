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
class Foo {
    String tmp;
    ArrayList<String> evenList = new ArrayList<>();
    ArrayList<String> oddList = new ArrayList<>();
    
    public Foo(String tmp){
        this.tmp = tmp;
    }
    
    public String getTmp(){
        return tmp;
    }
    
    public boolean equals(Object o){
        Foo foo = (Foo) o;
        if (foo.getTmp() == tmp){
            return true;
        } else
            return false;
    }
    
    
    
    
}

class QueueTest {
    
    public static void main (String[] args) throws java.lang.Exception{

        
        ArrayDeque<String> ad = new ArrayDeque<>();
        Random random = new Random();
        String a = "a";

        for(int i=0 ; i<50 ; i++){
            int r = random.nextInt(50)+1;
            System.out.println(r);
            String tmpA = new String(new char[r]).replace("\0", a);
            //for variaty String test 
            //System.out.println(tmpA);
            ad.add(tmpA);
            System.out.println(ad.peekLast());
        }
        
//        Iterator<String> iterator = ad.iterator();
//        while(iterator.hasNext()){
//            String tmpIterator = iterator.next();
//            for (int i=0 ; i < ad.size(); i++) {
//                if(ad.)
//            }
//        }
//        
        

    }
}