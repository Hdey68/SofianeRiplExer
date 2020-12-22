package com.sofiane.repl10;

import java.util.*;

public class Exercise203Set {
    /*
    Create an Employee class that will be fully encapsulated and will have:
variables as FullName, ssn and salary
constructor to initialize instance variables
getters to have an access to instance variables

Create a set collection that will store # objects of Employee type and using Iterator print the value of each variable

Expected Output:
John Doe
123456789
80000.0
Jane Smith
987654321
90000.0
Jackie Chan
0
1000000.0
     */
    static class Employee {
        private String fullName;
        private long ssn;
        private double salary;
        public Employee(String fullName, long ssn, double salary) {
            this.fullName=fullName;
            this.ssn = ssn;
            this.salary = salary;
        }
        public String getName() {
            return fullName;
        }
        public double getSalary() {
            return salary;
        }
        public long getSsn(){
            return ssn;
        }
    }
    public static void main(String[] args) {

        Set<Employee> company=new LinkedHashSet<> (  );
        company.add(new Employee("John Doe", 123456789, 80000));
        company.add(new Employee("Jane Smith", 987654321, 90000));
        company.add(new Employee("Jackie Chan", 00000000, 1000000));

        Iterator<Employee> it=company.iterator();
        while(it.hasNext()) {
            Employee emp=it.next();
            System.out.println(emp.getName());
            System.out.println(emp.getSsn());
            System.out.println(emp.getSalary());
        }
    }
}

