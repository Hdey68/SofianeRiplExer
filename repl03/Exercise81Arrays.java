package com.sofiane.repl03;

import java.util.Scanner;

public class Exercise81Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///Create an int array of integers with a size of 5 and input values with Scanner. 
		///Don't print prompt questions for a user.
		// Using loop print out each element of the array that should look like the output below
		// Example:
			// Input:
			// 1
			// 2
			// 3
			// 4
			// 5
			// Output:
			// 10
			// 20
			// 30
			// 40
			// 50
		//////////////////////////////////////////////////////////////////////////////
		
		Scanner input=new Scanner(System.in);
	
		int[] array=new int[5];
		
		for(int i=0; i<array.length; i++) {	
		int value=input.nextInt();
		}
	    for(int i=0; i<array.length; i++) {
	   
			System.out.println(array[i]+(i+1)*10);
	    }
	}///////////////////////////////////////done/////////////////////////////////////
}
