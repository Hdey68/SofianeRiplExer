package com.sofiane.repl09;

import java.util.LinkedList;

public class Exercise192List {
    /*
    Create Linked List that will store first 10 numbers of fibonacci series

Print number from Linked List 1 by 1 all in 1 line

Expected Output:
0 1 1 2 3 5 8 13 21 34
     */
    public static void main (String[] args) {
        LinkedList<Integer> list=new LinkedList<> (  );
        for(int i=2;i<10;i++){
            System.out.print (list );
        }

    }
}
