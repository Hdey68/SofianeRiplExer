package com.sofiane.repl10;

public class Exercise216ExceptionHandling {
    /*
    Create a program that will handle exception to match below output:

    Expected Output:
    java.lang.ArrayIndexOutOfBoundsException: 4
	at Main.main(Main.java:5)
     */
    public static void main (String[] args) {

            int a[] = new int[3];
            try{
            System.out.println ( a[4] );
        } catch (ArrayIndexOutOfBoundsException e) {
             e.printStackTrace ();
        }

    }/////////////////////////////////done/////////////////////////////////////////

    }

