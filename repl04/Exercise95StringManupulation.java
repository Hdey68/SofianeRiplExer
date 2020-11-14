package com.sofiane.repl04;

import java.util.Scanner;

public class Exercise95StringManupulation {
    //*Using Scanner class input string value.
    //Print out the following: "The first 3 letters of ___ is ___"
    //
    //For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban".

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str= input.next();
        System.out.println("The first 3 letters of "+str+" is "+str.substring(0,3));

    }
}
///////////////////////////////////////////////done////////////////////////////////////////////////////////////////