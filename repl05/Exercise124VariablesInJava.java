package com.sofiane.repl05;

public class Exercise124VariablesInJava {
    /*
    For you to do:
declare 3 instance variables to hold an integer, double and char values.

Create 2 instances of the class and assign values to variables and the print them

Expected Output:
10
10.23
a
100
100.23
s
     */
    static class Main {
        int var1;
        double var2;
        char var3;

        public static void main(String[] args) {
            Main ins= new Main();
            ins.var1 = 10;
            ins.var2 = 10.23;
            ins.var3 = 'a';

            System.out.println(ins.var1);
            System.out.println(ins.var2);
            System.out.println(ins.var3);
            Main ins2= new Main();
            ins2.var1 = 100;
            ins2.var2 = 100.23;
            ins2.var3 = 's';
            System.out.println(ins2.var1);
            System.out.println(ins2.var2);
            System.out.println(ins2.var3);
        }
    }
}////////////////////////////////////////////////////////////done///////////////////////////////////////////////////////







