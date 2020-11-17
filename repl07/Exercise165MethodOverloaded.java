package com.sofiane.repl07;

public class Exercise165MethodOverloaded {
    /*
    Overload static method and then execute both overloaded methods.

Expected Output:
static method without parameter
static method with int parameter
     */
    public static class Method {

           public static void m1() {
                System.out.println("static method without parameter");
            }
          public static  void m1( int a){
                System.out.println("static method with int parameter");
            }
        }
    public static void main(String[] args) {
        Method.m1();
        Method.m1(1);
    }
    }
//////////////////////////////////////////////////////done///////////////////////////////////////////////