package com.sofiane.repl10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Exercise204Map {
    /*
    Create A Map that will preserve an order of entry objects

Add below pairs :

"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"

Print all values of from the map

Expected Output:
Patrick ST
265
Vienna
22180
United State
     */
    public static void main (String[] args) {

        Map<String,String> map = new LinkedHashMap<>( );
        map.put ( "Street","Patrick ST" );
        map.put ( "Suite","265" );
        map.put ( "City","Vienna" );
        map.put ( "Zip","22180" );
        map.put ( "Country","United State" );
        for(String value: map.values ( )){
            System.out.println (value );
        }
    }
}/////////////////////////////////////////////////////////done////////////////////////////////////////////////////