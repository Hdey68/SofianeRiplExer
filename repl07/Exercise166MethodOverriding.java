package com.sofiane.repl07;

public class Exercise166MethodOverriding {
    /*
    In Parent Class create a method with name method() that will print  "Parent method"

Override method() in Child class that will print "Child method"

In Main Class create objects of child and parent class and call its method.

Expected Output:
Parent method
Child method
     */
    static class Parent{
        void method(){
            System.out.println("Parent method");
        }
    }
    static class Child{
        void method(){
            System.out.println("Child method");
        }
    }
    public static void main(String[] args) {
        Parent obj=new Parent();
        obj.method();
        Child obj1=new Child();
        obj1.method();
    }
}
/////////////////////////////////////////////done////////////////////////////////////////////////////////////