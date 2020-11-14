package com.sofiane.repl04;

public class Exercise107StringBuffer {
    //*How would you reverse a String using StringBuilder Class
    //Given String = "Hello Friends"
    //
    //Expected Output:
    //sdneirF olleH

    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello Friends");
        sb.reverse();
        System.out.println(sb);
    }
}
////////////////////////////////////////////////done//////////////////reverse-StringBuffer/////////////////////