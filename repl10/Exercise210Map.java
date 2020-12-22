package com.sofiane.repl10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Exercise210Map {
    /*
    Create a Hash Map of String pairs
add the follow values
map.put("ONE","AAA");
map.put("TWO","BBB");
map.put("THREE","CCC");
map.put("FOUR","DDD");
map.put("FIVE","EEE");

Using entry set print key and values pairs using loop

Remove below from Map
"ONE"
"FOUR"

Using entry set print key and values pairs using loop

Expected Output:
HashMap Before Remove :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : CCC
------------------
HashMap After Remove :
FIVE : EEE
TWO : BBB
THREE : CCC
     */
    public static void main (String[] args) {
        Map<String, String> map = new HashMap<> ( );
        map.put ( "ONE", "AAA" );
        map.put ( "TWO", "BBB" );
        map.put ( "THREE", "CCC" );
        map.put ( "FOUR", "DDD" );
        map.put ( "FIVE", "EEE" );
        System.out.println ( "HashMap Before Remove :" );
        Iterator<Map.Entry<String, String>> iterator = map.entrySet ( ).iterator ( );
        while (iterator.hasNext ( )) {
            Map.Entry<String, String> next = iterator.next ( );
            System.out.println ( next );

        }
        System.out.println ( "-----------------------" );
        System.out.println ( "HashMap After Remove :" );
        map.remove ( "ONE" );
        map.remove ( "FOUR" );
            System.out.println ( map );


        }
    }
