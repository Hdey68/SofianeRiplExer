package com.sofiane.repl04;

public class Exercise92StringManupulation {

    //*Validate if the string ends with "u" prints the boolean value accordingly.
    //Validate if the string ends with "world" prints the boolean value accordingly.
    //Validate if the string ends with "are" prints the boolean value accordingly.
    //Validate if the string ends with "you" prints the boolean value accordingly.

    public static void main(String[] args) {
        //starts the code from here
        String s1 = "hello how are you";
        boolean value = s1.endsWith("u");
        System.out.println(value);

        boolean value1 = s1.endsWith("world");
        System.out.println(value1);

        boolean value2 = s1.endsWith("are");
        System.out.println(value2);

        boolean value3 = s1.endsWith("you");
        System.out.println(value3);
    }
}//////////////////////////////////done////////////////////////////////////////////////