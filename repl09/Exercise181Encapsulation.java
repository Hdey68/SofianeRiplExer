package com.sofiane.repl09;

public class Exercise181Encapsulation {
    /*
    Create Class EncapsulationDemo that will have 2 variables empName and empAge;
Create the getter/setter methods for each variable.

In Main Class and main method

Using setter methods assign the values as "Mario" and "32"
Using getter methods print the values as below outputs.

 Expected Output:
Employee Name: Mario
Employee Age: 32
     */
    static class EncapsulationDemo{
        String empName;
        int empAge;

        public String getEmpName ( ) {
            return empName;
        }

        public int getEmpAge ( ) {
            return empAge;
        }

        public void setEmpName (String empNewName) {
            empName = empNewName;
        }

        public void setEmpAge (int empNewAge) {
            empAge = empNewAge;
        }
    }

    public static void main (String[] args) {
        EncapsulationDemo obj=new EncapsulationDemo ();
        obj.setEmpName ( "Mario" );
        obj.setEmpAge ( 32 );
        System.out.println ("Employee Name: "+ obj.getEmpName ());
        System.out.println ("Employee Age: "+obj.getEmpAge () );
    }
}
