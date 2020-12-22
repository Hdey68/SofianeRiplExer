package com.sofiane.repl10;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Exercise208Map {
    /*
    Create a Map that will preserve an order of entry objects
Add below pair to it .
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"

Print all values using iterator

Expected output:
Patrick ST
265
Vienna
22180
United State
     */
    public static void main (String[] args) {
        Map<String, String> map = new LinkedHashMap<> ( );
        map.put ( "Street", "Patrick ST" );
        map.put ( "Suite", "265" );
        map.put ( "City", "Vienna" );
        map.put ( "Zip", "22180" );
        map.put ( "Country", "United State" );
        Set<String> set = map.keySet ( );

        Iterator<String> iterator = set.iterator ( );

        while (iterator.hasNext ( )) {
            String key = iterator.next ( );
            System.out.println ( map.get ( key ) );
        }
    }
}//////////////////////////////////done///////////////////////////////////