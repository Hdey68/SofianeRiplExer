package com.sofiane.repl04;

public class Exercise98StringManupulation {
    //*Create a String given="Hello Syntax friends".
    //Using String methods from given String create new String "Welcome Syntax family"
    //
    //Expected Output:
    //Welcome Syntax family
    public static void main(String[] args) {
         String given="Hello Syntax friends";
        String str=("Welcome Syntax family");
        System.out.println(str.replaceAll("Hello,friends","Welcome,family"));

    }

}
///////////////////////////////////////////////////done/////replaceAll()///////////////////////////////////////////////