package com.sofiane.repl05;

public class Exercise130StaticKeyword {
    /*
    Create two methods:
The first method should be a non-static method that will print out the following message:
"Programming is amazing."

The second method should be a static method that will print out the following message:
"Java is awesome."

Execute both methods

Expected Output:
Programming is amazing.
Java is awesome.
     */
    static class Main {
        public void display() {
            System.out.println("Programming is amazing.");
        }

        public static void display1() {
            System.out.println("Java is awesome.");
        }

        public static void main(String[] args) {
           Main obj=new Main();
           obj.display();
           obj.display1();
        }
    }
}/////////////////////////////////////////////////done//////////////////////////////////////////////