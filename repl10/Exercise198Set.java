package com.sofiane.repl10;

import java.util.HashSet;

public class Exercise198Set {
    /*
    Create a Set and and below values to it.
[third, first, second]

Print HashSet and then remove all the elements from Hashset and print it again.

Expected Output:
[third, first, second]
[]
     */
    public static void main (String[] args) {
        HashSet<String> set=new HashSet<String>();
        set.add ( "third" );
        set.add ( "first" );
        set.add ( "second" );
        System.out.println (set );
        set.removeAll ( set );
        System.out.println (set );
    }
}
/////////////////////////////////////////////////done/////////////////////////////////////////////////