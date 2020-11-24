package com.sofiane.repl08;

public class Exercise176Interface {
    /*
    Create an Interface with name as MyInterface
Create two undefined methods method1 and method2

Inherit the MyInterface to Main Class.

Execute both methods

Expected Output:
implementation of method1
implementation of method2

     */
    interface MyInterface {
        default void m1() {
        }
        default void m2() {
        }
        class Main implements MyInterface{
        @Override
        public void m1() {
            System.out.println("implementation of method1");
        }
        @Override
        public void m2() {
            System.out.println("implementation of method2");
        }
    }
    public static void main(String[] args) {
       Main obj=new Main();
       obj.m1();
       obj.m2();
            }
        }
    }
//////////////////////////////////////////////////done//////////////////////////////////////////

