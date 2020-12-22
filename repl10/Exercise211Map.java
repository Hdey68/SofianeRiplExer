package com.sofiane.repl10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exercise211Map {
    /*
     Create Hash Map.
add the follow values

map.put("ONE","AAA");
map.put("TWO","BBB");
map.put("THREE","CCC");
map.put("FOUR","DDD");
map.put("FIVE","EEE");

Using EntrySet print the key and values pairs using iterator only

replace with below key THREE--> ASEL and key FIVE-->SUMAIR

Using EntrySet print the key and values pairs using iterator only

OUTPUT

HashMap Before Replace :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : CCC
------------------
HashMap After Replace :
FIVE : SUMAIR
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : ASEL
     */
        public static void main(String[] args) {
            Map<String, String> map = new HashMap<> ();
            map.put("ONE","AAA");
            map.put("TWO","BBB");
            map.put("THREE","CCC");
            map.put("FOUR","DDD");
            map.put("FIVE","EEE");
            System.out.println("HashMap Before Replace :");
            Set<Map.Entry<String, String>> setEntry = map.entrySet();
            for (Map.Entry<String, String> entry : setEntry) {
                System.out.println(entry.getKey()+ ":" + entry.getValue());
            }
            System.out.println("HashMap After Replace :");
            map.replace("THREE","ASEL");
            map.replace("FIVE","SUMAIR");
            for (Map.Entry<String, String> entry: setEntry) {
                System.out.println(entry.getKey()+ " : "+entry.getValue() );
            }
        }

    }//////////////////////////////////////done/////////////////////////////////////////////////

