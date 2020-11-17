package com.sofiane.repl06;

public class Exercise155SuperKeyword {
    /*In Parent class.
Create a constructor, it will take a String parameter called city.
include the logic of printing the parameter value.
Create another constructor without parameter.
Include the logic of printing "Parent Constructor".

Create a Child Class that should be a subclass of Parent class
Inside child class create a constructor that will make a call to parameterized constructor of the parent class.

In Main class.
Create an Object of the child class by passing String value "Vienna"

Expected Output:
Vienna
     */

   static class Parent {
        String city;
        public Parent(String city){
            this.city=city;
        }
    }
    static class Child extends Parent {
        public  Child(String city) {
            super(city);
            System.out.println(super.city);
        }
    }
    static class Main {
        public static void main(String[] args) {
            Child child = new Child("Vienna");
        }
    }///////////////////////////////////////////////////////done///////////////////////////////////////////////
}
