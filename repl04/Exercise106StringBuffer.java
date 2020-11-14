package com.sofiane.repl04;

public class Exercise106StringBuffer {
    //*Instantiate and StringBuffer class
    //Append Value "Hello" to it
    //Append value "World" to it.
    //Print in UPPERCASE.
    //
    //Expected Output:
    //HELLO WORLD

    public static void main(String[] args) {
            String word1 = "Hello";
            String word2= " World";
            String upper = word1.concat(word2);
            System.out.println(upper.toUpperCase());
        }
    }

