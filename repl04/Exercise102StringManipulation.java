package com.sofiane.repl04;

import java.util.Scanner;

public class Exercise102StringManipulation {
    //*Inputs:
    //String word;
    //
    //Write a for loop that will loop through every character of a word and print out each character, each on a separate line
    //
    // Sample inputs/outputs:
    //In: hello
    //h
    //e
    //l
    //l
    //o

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();

        for(String s:word.split("")){
            System.out.println(s);

        }


    }////////////////////////////////done///////////////////.split()/////////////////////////
}