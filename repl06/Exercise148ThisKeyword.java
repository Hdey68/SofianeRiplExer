package com.sofiane.repl06;

public class Exercise148ThisKeyword {
    /*
    1. Complete the Dog.java class:

Create following class variables.
dogName
dogWeight
static dogBreed=Mutt;
For all methods and variables use proper naming convention.

Create constructor to initialize instance variables

2. In Main class Create 2 Objets of a Dog class and using each object reference variable print details of objects.

Expected Output:
Tarzan Mutt 50.0
Lucy Mutt 10.0
     */
    static class Dog{

        String dogName;
        double dogWeight;
        static String dogBreed="Mutt";
        void method(String dogName, String dogBreed,double dogWeight){
            dogName=dogName;
            dogBreed=dogBreed;
            dogWeight=dogWeight;
            System.out.println(dogName+" "+dogBreed+" "+dogWeight);
        }
        public static void main(String[] args) {
            Dog obj=new Dog();
            obj.method("Tarzan","Mutt",50);
            Dog obj1=new Dog();
            obj1.method("Lucy","Mutt",10);
        }}


    }//////////////////////////////////////////////done/////////////////////////////////////////

