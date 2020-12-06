package com.sofiane.repl09;

public class Exercise180Encapsulation {
    /*
    Create Class EncapsulationDemo
create two variable as shown below.

private String empName;
private int empAge;

Create the getter/setter methods for each variable.

In Main Class and main method.
Using setter methods assign the values as "John" and "30"
Using getter methods print the values as below outputs.

Expected Output:
Employee Name: John
Employee Age: 30
     */
    static class EncapsulationDemo{
    private String empName;
    private int empAge;

    public String getEmpName(){
        return empName;
    }
    public int getEmpAge(){
        return empAge;
    }
        public void setEmpName (String newEmpName) {
        empName=newEmpName;
        }
        public void setEmpAge (int newEmpAge) {
        empAge=newEmpAge;
        }
    }

    public static void main (String[] args) {
        EncapsulationDemo encapDemo=new EncapsulationDemo ();
        encapDemo.setEmpName ( "John" );
        encapDemo.setEmpAge ( 30 );
        System.out.println ( "Employee Name: "+encapDemo.getEmpName ());
        System.out.println ("Employee Age: "+encapDemo.getEmpAge () );
    }
}/////////////////////////////////////////////////done//////////////////////////////////////////////////////////////
