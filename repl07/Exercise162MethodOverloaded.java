package com.sofiane.repl07;

public class Exercise162MethodOverloaded {
    /*
    Create 3 overloaded methods to perform subtraction of  2, 3 and 4 numbers
In main method execute all 3 methods to match the output:

Expected Output
40 (should come from subtracting 4 numbers)
30 (should come from subtracting 3 numbers)
20 (should come from subtracting 2 numbers)
     */
    static class Subtraction{

    void sub(int num1,int num2,int num3,int num4){
        System.out.println(num1-num2-num3-num4);
    }
    void sub(int num1,int num2,int num3){
        System.out.println(num1-num2-num3);
    }
    void sub(int num1,int num2){
        System.out.println(num1-num2);
    }
    }

    public static void main(String[] args) {
        Subtraction obj=new Subtraction();
        obj.sub(50,3,5,2);
        obj.sub(40,6,4);
        obj.sub(50,30);
    }
}
//////////////////////////////////////done//////////////////////////////////////////////////