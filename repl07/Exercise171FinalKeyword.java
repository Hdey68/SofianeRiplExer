package com.sofiane.repl07;

public class Exercise171FinalKeyword {
    /*
   Overload 2 final instance methods:

Call them in main method

Expected Output:
Final method with boolean parameter
Final method with String parameter
     */
    static class Main {
        final void method(boolean value) {
            System.out.println("Final method with boolean parameter");
        }
        final void method(String value){
            System.out.println("Final method with string parameter");
        }
    }

    public static void main(String[] args) {
        Main obj=new Main();
        obj.method(true);
        obj.method("a");
    }
}
/////////////////////////////////////////////////////////////////////done//////////////////////////////////////////////