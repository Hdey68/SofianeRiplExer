package com.sofiane.repl09;

public class Exercise183Encapsulation {
    /*
    Create Class Account
Create the below variables:
acc_no;
name;
email;
double amount;

Create the getter/setter methods for each variable.

In Main Class and the main method.
Using setter methods assign the values as:
acc_no = 7560504000
name = Sumair
email = sumair@syntax.com
amount = 50000.0
Using getter methods print the values as below output.

Expected Output:

7560504000 Sumair sumair@syntax.com 50000.0

     */
    static class Account{
        long acc_no;
        String name;
        String email;
        double doubleAmount;

        long getAcc_no(){
            return acc_no;
        }
        String getName(){
            return name;
        }
        String getEmail(){
            return email;
        }
        double getDoubleAmount(){
            return doubleAmount;
        }

        public void setAcc_no (long newAcc_no) {
            acc_no = newAcc_no;
        }

        public void setName (String newName) {
            name = newName;
        }

        public void setEmail (String newEmail) {
            email = newEmail;
        }

        public void setDoubleAmount (double newDoubleAmount) {
            doubleAmount = newDoubleAmount;
        }
    }

    public static void main (String[] args) {
        Account account=new Account ();
        account.setAcc_no ( 756050400 );
        account.setName ( "Sumair" );
        account.setEmail ( "sumair@syntax.com" );
        account.setDoubleAmount ( 50000.0 );
        System.out.println (account.acc_no+" "+account.name+" "+account.email+" "+account.doubleAmount );
    }
}
/////////////////////////////////////////////////////done/////////////////////////////////////////////////////////