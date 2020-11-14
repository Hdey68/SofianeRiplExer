package com.sofiane.repl05;

public class Exercise126VariablesInJava {
    /*
    Declare the instance variables to hold:
integer values
String values
double values
boolean values
float values

Access instance variables and then print them all without assigning any values to them.
Print variables one by one the same sequence that you declare them.

Expected Output:
0
null
0.0
false
0.0
     */
    static class Main {

        int val1;
        String val2;
        double val3;
        boolean val4;
        float val5;

        public static void main(String[] args) {
            Main ins = new Main();
            System.out.println(ins.val1);
            System.out.println(ins.val2);
            System.out.println(ins.val3);
            System.out.println(ins.val4);
            System.out.println(ins.val5);
        }
    }
}//////////////////////////////////////////////////////done//////////////////////////////////////////////////////////
