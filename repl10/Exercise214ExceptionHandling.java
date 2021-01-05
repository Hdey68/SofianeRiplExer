package com.sofiane.repl10;



public class Exercise214ExceptionHandling {
    /*
    Create a custom Exception class
In main class create a method that will check students grade
if students grade is >90 then below exception should be thrown
if students grade is below 90 print "You are a great student"

In main method calls method gradeCheck and handle an Exception

Expected Output:
SyntaxStudentException: You are an exceptionally awesome student
     */
    public static void main(String[] args) {
        try {
            gradeCheck(91);
        } catch (SyntaxStudentException e) {
            System.out.println(e);
        }
    }
    public static void gradeCheck(int grade){
        if(grade>90){
            throw new SyntaxStudentException("You are an exceptionally awesome student");
        }else {
            System.out.println("You are great student");
        }
    }
}
    class SyntaxStudentException extends RuntimeException {
    SyntaxStudentException(String message) {
        super ( message );
    }
}






