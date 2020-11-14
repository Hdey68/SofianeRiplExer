package com.sofiane.repl05;

public class Exercise125VariableInJava {
    /*
    Declare 3 instance variables to hold:
name of the country
capital
population size

Create a method to display values of instance variables

Create 2 Object, assign values to instance variables, execute method display;

Expected Output:
The capital of USA is Washington DC and population is 330000000
The capital of Kazakhstan is Astana and population is 18500000
     */

 static class Main {
     String countryName;
     String capital;
     int populationSize;

     public static void main(String[] args) {

             Main obj =new Main();
             obj.countryName="USA";
             obj.capital="Washington DC";
             obj.populationSize =330000000;
             System.out.println("The capital of "+ obj.countryName + " is " + obj.capital + " and population is " + obj.populationSize);

             Main obj2 =new Main();
             obj2.countryName="Kazakhstan";
             obj2.capital="Astana";
             obj2.populationSize =18500000;
             System.out.println("The capital of "+ obj2.countryName + " is " + obj2.capital + " and population is " + obj2.populationSize);
         }
     }
///////////////////////////////////////////done///////////////////////////////////////////////////////////////////////////////
     }

