package com.sofiane.repl03;

public class Exercise84_2DArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program that prints the highest value in the array.

		// Expected Output:
		// 8
		
		int[][] a = {
				{5,2,3,7},
				{1,5,1,1},
				{8,3,1,2}
			};
		int highest=0;
		for (int row = 0; row <a.length ; row++) {
			for (int col = 0; col <a[row].length; col++) {
				if(a[row][col]>highest) {
					highest=a[row][col];
				}}}
		System.out.println(highest);
					
				}
					
				}
			
			
		



