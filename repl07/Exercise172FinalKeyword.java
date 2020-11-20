package com.sofiane.repl07;

import com.sun.javafx.binding.StringFormatter;

public class Exercise172FinalKeyword {
    /*
    Create an instance final method that will reverse a String and return that new String

Call method from the main method

Expected Output:
olleh

     */
    static class Main{

        static final String reverseString(String str){
            StringBuilder sb=new StringBuilder(str);
            sb.reverse();
           return sb.toString();
        }
    }
    public static void main(String[] args) {
        System.out.println(Main.reverseString("hello"));
    }
}
////////////////////////////////////////////done//////////////////////////////////////////////////////////////////