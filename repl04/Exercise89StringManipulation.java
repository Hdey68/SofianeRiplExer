package com.sofiane.repl04;

public class Exercise89StringManipulation {
    // For you to do:
    //Create a String "name" and assign the value "Timmy" to it.
    //Find out how many characters are there in the given String.

    public static void main(String[] args) {

        String name = "Timmy";
        int charactersCount = 0;

        String[] characters=name.split("");
        charactersCount+=characters.length;
        System.out.println(charactersCount);
    }
}
//////////////////////////////////////////////////done//////////////////////////////////////////////////////