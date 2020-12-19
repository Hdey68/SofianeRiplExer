package com.sofiane.repl10;

import java.util.HashSet;

public class Exercise199Set {
    /*
    Create a set collection in which you do not want to preserve or sort the order and add below values to it.

Red
Pink
Yellow
White
Black

Print set collection
And get total number of colors available in the set

Expected Output:
Original Hash Set: [Red, Pink, White, Yellow, Black]
Size of the Hash Set: 5
     */
    public static void main (String[] args) {
        HashSet<String> set=new HashSet<String>();
        set.add ( "Red" );
        set.add ( "Pink" );
        set.add ( "Yellow" );
        set.add ( "White" );
        set.add ( "Black" );
        System.out.println ("Original Hash Set: "+set );
        System.out.println ("Size of the Hash Set: "+set.size () );

    }
}/////////////////////////////////////////////done/////////////////////////////////////////////////
