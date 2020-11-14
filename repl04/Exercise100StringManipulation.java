package com.sofiane.repl04;

import jdk.nashorn.internal.objects.NativeString;

import java.util.Scanner;

public class Exercise100StringManipulation {
    //*  Given the following inputs:
    //String s;
    //
    //Write a for loop that will print out the reverse of the string.
    //
    //Sample input/outputs:
    //In: manhattan
    //nattahnam
    //
    //In: processor
    //rossecorp
    //
    //In: racecar
    //racecar

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();

        String rev="";
        for(int j=s.length();j>0;--j)
        {
            rev=rev+(s.charAt(j-1));
        }
        System.out.println(rev);
    }
    }//////////////////////////////////////////////////done////////////reverse string///////////////////////////////////
