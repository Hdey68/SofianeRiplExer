package com.sofiane.repl03;

public class Exercise82_2DArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to print values from a 2D array

		// Example Output:
		// 1.4 2.0 3.3 2.0 
		// 4.0 1.5 6.1 1.0 
		// 1.2 3.1 4.0 1.6 
		
		double[][] a = {
				{1.4,2.0,3.3,2.},
				{4,1.5,6.1,1},
				{1.2,3.1,4,1.6}
			};
		for(int row=0; row<a.length; row++) {
		 
			for(int col=0; col<a[row].length; col++) {
			
		System.out.print(a[row][col]+" ");
			
			}
	  System.out.println();
	}//////////////////////////////////////done///////////////////////////////////////
	}}
