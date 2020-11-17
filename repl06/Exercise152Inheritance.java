package com.sofiane.repl06;

public class Exercise152Inheritance {
    /*
    Create Three classes (Main, A, B):

Have a method that prints out the following
For A:  "Class A"
For B:  "Class B"

Make B extend A

From your Main class create an object of the B class and call the methods.

Output:

Class A
Class B
     */
    static class A {
        public void display() {
            System.out.println("Class A");
        }
    }
    static class B extends A {
        public void display1() {
            System.out.println("Class B");
        }
    }
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
        obj.display1();
    }
}/////////////////////////////////////////////////////////done////////////////////////////////////////////