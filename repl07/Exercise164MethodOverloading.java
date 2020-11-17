package com.sofiane.repl07;

public class Exercise164MethodOverloading {
    /*
    Overload private instance method m1

Call each method from the main method.

Expected Output:
private m1 method
private m1 method with int parameter
     */
    static class Method{
        private void m1(){
            System.out.println("private m1 method");
        }
        private void m1(int a){
            System.out.println("private m1 method with int parameter");
        }
    }
    public static void main(String[] args) {
        Method obj=new Method();
        obj.m1();
        obj.m1(1);
    }
}
///////////////////////////////////////////////////done//////////////////////////////////////////////////////////////