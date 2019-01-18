
package test;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Miłosz
 */
public class HashMapMerge {

    public static void main(String[] args) {
  Map <Integer,String> myFavoriteColors = new HashMap <Integer,String> ();
    Map <Integer,String> myFriendsFavoriteColors = new HashMap <Integer,String>();
    
    myFavoriteColors.put(1, "Red");
    myFavoriteColors.put(2, "Green");
    myFavoriteColors.put(3, "Black");
    
    System.out.println("Values in first map: " + myFavoriteColors);
    
    myFriendsFavoriteColors.put(4, "White");
    myFriendsFavoriteColors.put(5, "Blue");
    myFriendsFavoriteColors.put(6, "Orange");
   
    System.out.println("Values in second map: " + myFriendsFavoriteColors);
    
    Map <Integer,String> ourFavoriteColors = new HashMap <Integer,String> ();
    
    for(Map.Entry<Integer,String> entry : myFriendsFavoriteColors.entrySet()) {
        ourFavoriteColors.put(entry.getKey(), entry.getValue());
    }
    for(Map.Entry<Integer,String> entry : myFavoriteColors.entrySet()) {
        ourFavoriteColors.put(entry.getKey(), entry.getValue());
    }
            System.out.println(ourFavoriteColors);

    
    //Faster solution for merge HashMap
    Map <Integer,String> ourColors = new HashMap <Integer,String> ();
    ourColors.putAll(myFavoriteColors);
    ourColors.putAll(myFriendsFavoriteColors);
    System.out.println(ourColors);
    }
    
}
