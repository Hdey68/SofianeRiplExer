package com.sofiane.repl03;

import java.util.Scanner;

public class Exercise80Arrays01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an array of integers that will store 5 elements taken from a user
		//Don't print any prompt message for the user
		//Then print out all the elements you have created in the first loop in reverse order. 
		//Example: 
		//Input: 
		//1
		//2
		//3
		//4
		//5
		//Output:
		//5
		//4
		//3
		//2
		//1
		
		Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();
        int num4=input.nextInt();
        int num5=input.nextInt();
        
        int[] nums= {1,2,3,4,5};
        
        for(int i=4; i>=0; i--) {
        	System.out.println(nums[i]);
        }//////////////////////////////////////////////////done/////////////////////////////////////////////////
	}

}
