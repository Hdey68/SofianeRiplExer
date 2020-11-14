package com.sofiane.repl04;

public class Exercise90StringManipulation {
    //Create a String named s1 = "hello"  check weather string is empty or not
    //Create a String named s2 = ""  check weather string is empty or not
    //
    //Expected Output:
    //false
    //true


    public static void main(String[] args) {

        String s1="hello";
        String s2="";
        int length1=s1.length();
        if(length1<=0) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }
            int length2=s2.length();
        if(length2>0) {
            System.out.println(false);
        }else{
            System.out.println(true);
        }
    }
}
/////////////////////////////////////////////////done//////////////////////////////////////////////////////