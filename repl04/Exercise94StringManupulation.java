package com.sofiane.repl04;

public class Exercise94StringManupulation {
    //*Create a String given="I love Java classes at Syntax"
    //Retrieve 2 Strings from given String and print them
    //
    //Expected Output:
    //classes at Syntax
    //I love Java

    public static void main(String[] args) {
        String str="I love Java classes at Syntax";
        System.out.println(str.substring(12));
        System.out.println(str.substring(0,11));
    }
}
//////////////////////////////////////////////////done/////////////////////////////////////////////////////////////////////