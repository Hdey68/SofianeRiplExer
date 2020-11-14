package com.sofiane.repl05;

public class Exercise128VariableInJava {
    /*
    Declare a static variable number that will hold an integer value:

Access number from the main method and assign value to it.
Create an Object of the class, access number in a nonstatic way and assing value of 200.

Print out number using class name and using instance

Expected Output:
200
200
     */
    static class Main {
        int num = 200;

        public static void main(String[] args) {
            Main main = new Main();
            Main main2 = new Main();
            System.out.println(main.num);
            System.out.println(main2.num);
        }
    }
}




        





