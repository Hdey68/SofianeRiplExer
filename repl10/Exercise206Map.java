package com.sofiane.repl10;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Exercise206Map {
    /*
    Create Map in which we want to store keys in Ascending order
Add the below values
1 item = apple
2 item = banana
3 item = pear
4 item = tomato
5 item = mango
6 item: kiwi

Extract all keys and it values and print them in the format below:

Expected Output:
Key is 1 item and values is apple
Key is 2 item and values is banana
Key is 3 item and values is pear
Key is 4 item and values is tomato
Key is 5 item and values is mango
Key is 6 item and values is kiwi
     */
    public static void main (String[] args) {
        Map<String,String> map=new TreeMap<> (  );
        map.put ( "1 item","apple" );
        map.put ( "2 item","banana" );
        map.put ( "3 item","pear" );
        map.put ( "4 item","tomato" );
        map.put ( "5 item","mango" );
        map.put ( "6 item","kiwi" );

        Set<String> itemNames= map.keySet ( );

        Iterator<String> iterator =itemNames.iterator();

        while (iterator.hasNext()){
            String key=iterator.next();
            System.out.println("Key is "+key+" and values is "+map.get(key));
        }
    }
}/////////////////////////////////////////////done/////////////////////////////////////
