package com.sofiane.repl06;

public class Exercise156SuperKeyword {
    /*
    In parent class
Create a non argument constructor and write a logic to print "This is Parent constructor"

Create a Child Class that will be subclass of the Parent class.
Create a constructor without parameter and call parent class constructor expicitly

In Main Class.
Create and object of Child class and run the application.

Expected Output:
This is Parent constructor
     */
    static class Parent {

       public void Parent() {
            System.out.println("This is Parent constructor");
        }
    }
    static class Child extends Parent {
        public void Parent() {
            super.Parent();
        }
    }
    public static void main(String[] args) {
        Child child=new Child();
        child.Parent();
    }
    }///////////////////////////////////////////////////////done////////////////////////////////////////