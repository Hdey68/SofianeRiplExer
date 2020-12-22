package com.sofiane.repl10;

import java.util.HashMap;
import java.util.Map;

public class Exercise212Map {
    /*
    HashMap, Methods, reusability, Logic
Create a Method in Main class using below specification.
Method Name: Display.
Return Type: Void
Parameters : Map<String,Integer>
Logic:
First the method will check the given map is empty or not.
If the map is not empty print pairs of key and value using loops
If map is empty simply print "map is empty"

NOW IN MAIN METHOD
Create HashMap of String keys and Integer values
add values as below
map.put("mango", 10);
map.put("apple", 30);
map.put("orange", 20);

using created display method to display.

then clear the map.

use the same method to display

     */
    static void display(Map<String,Integer>map){
        // System.out.println(map.isEmpty());
        if(map.isEmpty()){
            System.out.println("map is empty");
        }else{
            for(String key: map.keySet()){
                String pair=key+" "+map.get(key);
                System.out.println(pair);
            }
        }
    }
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<> ();
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);
        display(map);
        map.clear();
        display(map);
    }

}
/////////////////////////////////////////////done/////////////////////////////////////////////////
