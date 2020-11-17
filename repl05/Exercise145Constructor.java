package com.sofiane.repl05;

public class Exercise145Constructor {
    /*
    1. Complete the SyntaxTechnologies class:

Include the following class variables:
* schoolName(String)
* batch(int)
* year(int)
* lastDayOfClass(String)

Write two constructors:
* non-argument constructor
* parameterized constructor

Create method to display values of instance variables.

2. In Main Class:
Create two different objects of the SyntaxTechnologies class using both constructors and call display method.

Expected Output:
null 0 0 null
Syntax 6 2020 07/30/2020
     */
   static class SyntaxTechnologies {
        String schoolName;
        int batch;
        int year;
        String lastDaysOfClass;

        SyntaxTechnologies() {
            System.out.println(schoolName+" "+batch+" "+year+" "+lastDaysOfClass);
        }
        SyntaxTechnologies(String schoolName, int batch, int year, String lastDaysOfClass) {
            System.out.println(schoolName+" "+batch+" "+year+" "+lastDaysOfClass);
        }
    }
        public static void main(String[] args) {
        SyntaxTechnologies obj1=new SyntaxTechnologies();
        SyntaxTechnologies obj2=new SyntaxTechnologies("Syntax",6,2020,"07/30/2020");
        }
       }


