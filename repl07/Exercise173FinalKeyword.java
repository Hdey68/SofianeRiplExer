package com.sofiane.repl07;

public class Exercise173FinalKeyword {
    /*
    Create final method avgElements that will average all the elements in an integer array
    (passed to the method as a parameter) and return the average.

Expected Output:
4.8
     */
    static class Main {
        public static final void main(String[] args) {
            int[] a = {2, 7, 3, 8, 4};
            double sum = 0;
            for(int i=0; i < a.length; i++)
                sum = sum + a[i];
            double avgElements = sum / a.length;
            System.out.println(avgElements);
        }
        }
    }
//////////////////////////////////////////////////////done//////////////////////////////////////////////////////////