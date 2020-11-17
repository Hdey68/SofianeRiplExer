package com.sofiane.repl06;

public class Exercise153Inheritance {
    /*
    1. Create four classes (Person, Employee, Student, Retiree)

* Have properties
For Person: name(String)
For Person: lastName(String)
For Person: age(int)
For Employee: salary(int)
For Student: grade(int)
For Retiree: seniorActivity(String)

At Employee, Student, Retiree Class have a print method in each that prints the properties in line as shown in the output

Create multilevel inheritance: Person --> Employee --> Student --> Retiree

From your Main class create objects of the Employee, Student and Retiree classes and call the print method.

Expected Output:
Joe Smith 35 35000
Adam Smith 15 10
Frank Smith 15 tour
     */
    static class Person{
      String name;
      String lastName;
      int age;
      void display(String name,String lastName,int age) {
      }
    }
    static class Employee extends Person{
        int salary;
        void display1(String name, String lastName, int age,int salary){
            System.out.println(name+" "+lastName+" "+age+" "+salary);
        }
    }
    static class Student extends Person{
        int grade;
        void display2(String name, String lastName, int age,int grade) {
            System.out.println(name+" "+lastName+" "+age+" "+grade);
        }
    }
    static class Retiree extends Person{
        String seniorActivity;
        void display3(String name, String lastName, int age,String seniorActivity) {
            System.out.println(name+" "+lastName+" "+age+" "+seniorActivity);
    }
}
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.display1("Joe","Smith",35,35000);
        Student student=new Student();
        student.display2("Adam","Smith",15,10);
        Retiree retiree=new Retiree();
        retiree.display3("Frank","Smith", 15,"tour");
    }
    }/////////////////////////////////////////////////done////////////////////////////////////////////////////