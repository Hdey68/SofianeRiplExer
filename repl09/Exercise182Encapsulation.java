package com.sofiane.repl09;

public class Exercise182Encapsulation {
    /*
    Create Class EncapsulationDemo

create two variable as shown below.
private String empName=John;
private int empAge=30;

Create only getters methods for each variable.

Print the values of each variable as shown below.

Expected Output:
Employee Name: John
Employee Age: 30

     */
    static class EncapsulationDemo{
        private String empName="John";
        private int empAge=30;

        String getEmpName(){
            return empName;
        }
        int getAge(){
            return empAge;
        }
    }

    public static void main (String[] args) {
        EncapsulationDemo obj=new EncapsulationDemo ();

        System.out.println ("Employee Name: "+ obj.empName );
        System.out.println ("Employee Age: "+obj.empAge );
    }
}
//////////////////////////////////////////done////////////////////////////////////////////////////////////////////