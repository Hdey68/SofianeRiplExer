package com.sofiane.repl05;

public class Exercise131StaticKeyword {
    /*
    Declare two static variables to hold
country name
continent

Create a method to display the value of static variables in the following format:

____ located on ____ continent

In the main method assign values to a static variable and execute method display

Expected Output:
Morocco located on Africa continent
     */
    static class Main{
        static String country,continent;
        static void display(){
            System.out.println(country+" located on "+continent+" continent");
        }
        public static void main(String[] args) {
            Main obj=new Main();
            obj.country="Morocco";
            obj.continent="Africa";
            display();
        }
    }
}//////////////////////////////////////////////done/////////////////////////////////////////////////////////
