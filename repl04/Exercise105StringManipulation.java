package com.sofiane.repl04;

import java.util.Scanner;

public class Exercise105StringManipulation {
    //*There is a code that takes input as a String.
    //Write a program that will print out only vowels of that string
    //
    //Sample input/outputs:
    //In: howdyho
    //oo
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();

        for(int str=0; str<word.length(); str++){
            char c = Character.toLowerCase(word.charAt(str));
            if (c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u'){
                System.out.print(word.charAt(str));
            }
            }
        }
    }


//////////////////////////////////////////////done  vowels///////////////////////////////////////////////////////