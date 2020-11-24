package com.sofiane.repl08;

public class Exercise174AbstractClass {
    /*
    Create a Parent Class in which you will have 1 implemented method m2 and 1 unimplemented method m1

Make Main class to be a derived class from Parent.

In main method execute both methods

Expected Output:
Child class providing implementation
Parent class providing implementation
     */
  public  interface Parent {
        void m1();
        void m2();
    }
    public static class Child implements Parent{

        @Override
        public void m1(){
            System.out.println("Child class providing implementation");
        }
        @Override
        public void m2(){
            System.out.println("Parent class providing implementation");
        }
    }
    public static void main(String[] args) {
        Parent parent=new Child();
        parent.m1();
        parent.m2();
    }
}////////////////////////////////////////////////////////done//////////////////////////////////////////////////////

