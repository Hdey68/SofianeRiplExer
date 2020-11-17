package com.sofiane.repl04;

import java.util.Scanner;

public class Exercise120JavaMethods {
   /*
    Create a method with the following specs:

Returns:
an integer
Name:
sumEvenToX
Parameters:
an integer called "x"
Purpose:
calculate the sum of the EVEN integers from 1 to x (including x)

Examples:
sumEvenToX(5) ==> 6
sumEvenToX(8) ==> 20
    */
   public static class Main {
       int sum;
       int sumEvenToX(int x){
           for (int i=0; i<=x; i+=2){
               sum=sum+i;
           }
           return sum;
       }
       public static void main (String[] args){
           Scanner scan =new Scanner(System.in);
           Main obj=new Main();
           Main obj2=new Main();

           int x=scan.nextInt();
           int a=obj.sumEvenToX(x);
           System.out.println(a);

           int y=scan.nextInt();
           int b=obj2.sumEvenToX(y);
           System.out.println(b);

/////////////////////////////////////////////////////////////////////////done///////////////////////////////////////////

       }}
}
