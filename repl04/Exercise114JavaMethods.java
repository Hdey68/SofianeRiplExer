package com.sofiane.repl04;

public class Exercise114JavaMethods {
    /*
    Step1: Create three methods that will accept 2 in parameters on integer type
Step2: Write the logic in methods to perform actions below:
The first method for multiplication
The second method for addition
The third method for subtraction
Step3: execute all methods
1. for the addition method add two numbers to make 30
2. for multiplication multiply two numbers to make 30
3. for Subtraction subtract two numbers to equal 20
Expected Output:
Addition 30
Multiplication 30
Subtraction 20
*/
    static void m1(int a, int b) {
        System.out.println("Multiplication "+(a * b));
    }
    static  void  m2(int c, int d) {
        System.out.println("Addition "+(c + d));
    }
    static void  m3(int f, int g){
        System.out.println("Subtraction "+(f - g));
    }

    public static void main(String[] args) {
        m2(14,16);
        m1(5,6);
        m3(30,10);
    }
}/////////////////////////////////////DONE  JAVA METHODS///////////////////////////////////////////////////////
