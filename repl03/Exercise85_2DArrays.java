package com.sofiane.repl03;

public class Exercise85_2DArrays {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program that will print the sum of all elements in 2D array. 
		// Expected Output:
		// -9
		 // ------------------------------------------------------------------------//
		
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2, 2},
				{1,-2, 3,-4}
			};
		
		int sum = 0;
		for(int row=0;row<a.length;row++) {
			for(int col=0;col<a[row].length;col++){
				sum= sum+a[row][col];
			}
		}
		System.out.println(sum);
	}

}
