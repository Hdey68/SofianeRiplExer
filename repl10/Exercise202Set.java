package com.sofiane.repl10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Exercise202Set {
    /*
    Create a student class that will have
variables as studentId, name and lastName
constructor
method to display students details

Create a set that will store 5 different students in an order they been added to the collection.

Execute method to display students details

Expected Output:
Student details: Samir Jawaid with id: 101
Student details: Asel Umurzakova with id: 102
Student details: Diego Juarez with id: 103
Student details: Sohil Aryan with id: 104
Student details: Alijon Nazarov with id: 105
     */

    static class Student {
        int studentId;
        String name;
        String lastName;

        Student (String name, String lastName, int studentId) {
            this.name = name;
            this.lastName = lastName;
            this.studentId = studentId;

        }
    }
    public static void main (String[] args) {
        Student student1 = new Student ( "Samir","Jawaid",101 );
        Student student2 = new Student ( "Asel", "Umurzakova",102 );
        Student student3 = new Student ( "Diego", "Juarez",103 );
        Student student4 = new Student ( "Sohil", "Aryan",104 );
        Student student5 = new Student ( "Alijon", "Nazarov",105 );

        Set<Student> hash = new LinkedHashSet<>();
        hash.add ( student1 );
        hash.add ( student2 );
        hash.add ( student3 );
        hash.add ( student4 );
        hash.add ( student5 );

        Iterator<Student> itr = hash.iterator ( );
        while (itr.hasNext ( )) {
            Student student = (Student) itr.next ( );
            System.out.println ( "Student details: " + student.name + "  " + student.lastName+" with id: "+ student.studentId );
        }
}}////////////////////////////////////////////////////////done//////////////////////////////////////////////////////////////////