package com.sofiane.repl05;

public class Exercise123VariablesInJava {
    /*
    Declare 3 instance variables to hold:

    year, school name and batch #

    Access variables from the main method and assign specific values to them
    Print values of your variables in the following format:

    Expected Output:
    I am a student of batch 6 studying at Syntax in the year of 2020

     */static class Main {
        int year;
        String schooldName;
        int batch;

        public static void main(String[] args) {
            Main syntax = new Main();
            syntax.year = 2020;
            syntax.schooldName = "Syntax";
            syntax.batch = 6;
            System.out.println("I am a student of batch " + syntax.batch + " studying at " + syntax.schooldName + " in the year of " + syntax.year);
        }
    }
}///////////////////////////////////////////////////done/////////////////////////////////////////////////