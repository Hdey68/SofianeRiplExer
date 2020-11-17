package com.sofiane.repl06;

public class Exercise158SuperKeyword {
    /*
    1. Create three classes (A, B, C)
Write two constructors:
* Have a default constructor that prints out the following
For A:  "I"
For B: "am"
For C: "a tester"
Make C extend B
and B extend A
From your Main class create an object of the C class.
Expected Output:
I
am
a tester
     */
    static class A{
        A(){
            System.out.println("I");
        }
    }
    static class B extends A{
        B(){
            System.out.println("am");
        }
    }
    static class C extends B {
        C() {
            System.out.println("a tester");
        }
    }
    public static void main(String[] args) {
        C c=new C();
    }
    }

////////////////////////////////////////////////done///////////////////////////////////////////////