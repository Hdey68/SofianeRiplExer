package com.sofiane.repl09;

import java.util.ArrayList;

public class Exercise185List {
    /*
    ArrayLists
Create an array list that will hold String Objects
Find out wether array list is empty or not.
Add String value "Syntax" to it
Find out wether array list is empty or not.

Expected Output:
true
false
     */
    public static void main (String[] args) {

        ArrayList<String> arrayList = new ArrayList<> ( );
        System.out.println (arrayList.isEmpty () );
        arrayList.add ( "Syntax" );
        System.out.println (arrayList.isEmpty () );

    }

}///////////////////////////////////////////////////////////////done///////////////////////////////////