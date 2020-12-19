package com.sofiane.repl10;

import java.util.HashSet;
import java.util.Iterator;

public class Exercise197Set {

    /*
    Create the HashSet with list of Integers add the below numbers for the list
111
111
111
999
999
999

Print elements one by one.

Expected Output
999
111
     */
    public static void main (String[] args) {

        HashSet<Integer> list=new HashSet<> (  );
        list.add ( 111 );
        list.add ( 111 );
        list.add ( 111 );
        list.add ( 999 );
        list.add ( 999 );
        list.add ( 999 );
        Iterator<Integer> iter= list.iterator ( );
        while(iter.hasNext ( )){
            System.out.println (iter.next () );
        }
    }
}////////////////////////////////////////////////////done////////////////////////////////////////////
