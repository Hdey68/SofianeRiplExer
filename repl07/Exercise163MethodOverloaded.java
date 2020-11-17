package com.sofiane.repl07;

public class Exercise163MethodOverloaded {
    /*
    For you to do:
Overload instance method display by having different types of parameters
Inside each method write the logic to print value of the parameter

Call all methods inside your main method

Expected Output:
100
Syntax Technologies
100.09
     */
    static class Main{
        void m1(int num){
            System.out.println(num);
        }
        void m2(String str){
            System.out.println(str);
        }
        void m3(double num){
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        Main obj=new Main();
        obj.m1(100);
        obj.m2("Syntax Technologies");
        obj.m3(100.09);
    }
}////////////////////////////////////////////////////////done///////////////////////////////////////////////////////
