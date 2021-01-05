package com.sofiane.repl10;

public class Exercise215ExceptionHandling {
    /*
    Create a method that will do temperature check.
    Anytime user passes temperture that is below 32 method should throw an Exception saying
    "It is freezing"
    In Main method call the method and handle an Exception
    Expected Output:
    java.lang.RuntimeException: It is freezing
     */
    public static void main(String[] args) {
        try{
            temperatureCheck(31);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void temperatureCheck(int degree) throws RuntimeException{
        if(degree<32){
            throw new RuntimeException("It is freezing");
        }
    }
}////////////////////////////////done//////////////////////////////////////////

