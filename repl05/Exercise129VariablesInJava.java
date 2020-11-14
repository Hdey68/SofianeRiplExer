package com.sofiane.repl05;

public class Exercise129VariablesInJava {
    /*
    Create a variable that will hold the count of all instances of the Main class

Create 3 Object of the class and print value of the count variable;

Expected Output:
3
     */
    static class Main {
        static int count;

        public static void main(String[] args) {
            Main obj = new Main();
            count++;
            Main obj1 = new Main();
            count++;
            Main obj2 = new Main();
            count++;
            System.out.println(count);
        }
    }
}////////////////////////////////////////done//////////////////////////////////////////////
