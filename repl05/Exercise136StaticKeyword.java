package com.sofiane.repl05;

public class Exercise136StaticKeyword {
    /*
    Create a static method with the following specs:

Returns:
an integer
Name:
countA
Parameters:
a String called s
Purpose:
count the number of occurrences of 'a' or 'A' within s

Examples:
countA("aaa") ==> 3
countA("aaBBdf8k3AAadnklA") ==> 6

Hint: How do you write a for loop to loop through every letter of a string?  You've done this multiple times already :)
     */
    static class Main {
        static int countA(String s) {

            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'A') {
                    sum++;
                }
                if (s.charAt(i) == 'a') {
                    sum++;
                }
            }
            return sum;
        }
            //test case below (dont change):
            public static void main(String[] args) {
                System.out.println(countA("aaA")); //3
                System.out.println(countA("aaBBdf8k3AAadnklA")); //6
            }
        }
    }

///////////////////////////////////////////done//////////////////////////////////////////////////////

