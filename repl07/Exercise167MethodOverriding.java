package com.sofiane.repl07;

public class Exercise167MethodOverriding {
    /*
    Parent class create 4 methods with different level of access modifiers. In each method print "I am parent public/protected/default/private method".

Override methods in child class

In Main Class create object of the child class and see which methods are available

Expected Output:
I am a child public method
I am a child protected method
I am a child default method
     */
     static class Parent{
        public void method(){
            System.out.println("I am parent public");
        }
        protected void method2(){
            System.out.println("I am parent protected");
        }
        void method3(){
            System.out.println("I am parent default");
        }
        private void method4(){
            System.out.println("I am parent private");
        }
    }
    static class Child extends Parent{
        public void method(){
            System.out.println("I am a child public method");
        }
        protected void method2(){
            System.out.println("I am a child protected method");
        }
        void method3(){
            System.out.println("I am a child default method");
        }
        private void method4(){
            System.out.println("I am parent private");
        }
    }
    static class Main {
        public static void main(String[] args){
            Parent parent = new Child();
            parent.method();
            Parent parent1 = new Child();
            parent1.method2();
            Parent parent2 = new Child();
            parent2.method3();
            //Parent parent4 = new Child();
            // parent4.method4();
        }
    }
    }//////////////////////////////////////////////////////////done//////////////////////////////////////////////////

