package com.sofiane.repl04;

public class Exercise119JavaMethods {
    /*
    Create a method that will accept 2 numbers as parameters and return true if both numbers are even otherwise returned false
( Return false if one or both given numbers are not even)

Examples:
bothEven(4,6) ==> true
bothEven(3,4) ==> false
bothEven(-1,1) ==> false

Expected Output:
false
     */
    static class Main {
        boolean bothEven(int x, int y) {
            if (x % 2 == 0 && y % 2 == 0) {
                return true;

            } else if (x % 2 != 0 || y % 2 != 0) {
                return false;

            } else {
                return false;
            }
        }
        public static void main(String[] args) {
            Main obj = new Main();
            boolean a = obj.bothEven(-1, 6);
            System.out.println(a);

        }
    }
}//////////////////////////////////////////////////done//////////////////////////////////////



