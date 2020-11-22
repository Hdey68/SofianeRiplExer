package com.sofiane.repl08;

public class Exercise173AbstractClass {
    /*
    Create a Parent Class that will have two overloaded abstract methods m1

Make Main class as concrete subclass to Parent Class

In main method call the methods.

Expected Output:
m1 without parameters
m1 method with parameter
     */
    static abstract class Parent {
        abstract void m1();

        abstract void m1(String str);
    }
    static class Child extends Parent{
        @Override
        void m1() {
            System.out.println("m1 without parameters");
        }
        @Override
        void m1(String str) {
            System.out.println(str);
        }
    }
    public static void main(String[] args) {
        Parent parent=new Child();
        parent.m1();
        parent.m1("m1 method with parameter");
    }
}//////////////////////////////////////////////done/////////////////////////////////////////////





