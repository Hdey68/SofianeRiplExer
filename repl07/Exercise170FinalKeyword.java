package com.sofiane.repl07;

public class Exercise170FinalKeyword {
    /*
    Create a constant variable to hold value "https://syntaxtechs.com"
Print value of constant variable in the main method

Expected Output:
https://syntaxtechs.com
     */

    static class Main{
        final void s(){
            System.out.println("https://syntaxtechs.com");
        }
    }

    public static void main(String[] args) {
        Main m=new Main();
        m.s();
    }
}
////////////////////////////////////////////////////done//////////////////////////////////////////////////////////////