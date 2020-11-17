package com.sofiane.repl05;

public class Exercise144AccessModifiers {
    /*
    Create the maxValue method that will accept int array and return return the maximum value in the array.

Method should visible every class in any package!

Expected Output:
22

     */
    static class Main {
        public static void main(String[] args) {
            int[] arr = {5, 12, -3, 7, 3, 22};
            System.out.println(maxValue(arr)); //should print 22
        }
        public static int maxValue(int[] num) {
            int max = num[0];
            for (int i = 0; i < num.length; i++) {
                if (max < num[i]) {
                    max = num[i];
                }
            }
            return max;
        }
    }
}///////////////////////////////////////////done//////////////////////////////////////////////////////////////
