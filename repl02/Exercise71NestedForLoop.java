package com.sofiane.repl02;

public class Exercise71NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Write a program to print out the pattern: 

			// Expected output:
			// 1 2 3 4 5 6 7 
			// 1 2 3 4 5 6 
			// 1 2 3 4 5 
			// 1 2 3 4 
			// 1 2 3 
			// 1 2 
			// 1 
			// 1 2 
			// 1 2 3 
			// 1 2 3 4 
			// 1 2 3 4 5 
			// 1 2 3 4 5 6 
			// 1 2 3 4 5 6 7
		
		for(int i=7; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int a=2; a<=7; a++) {
			for(int b=0; b<a; b++) {
				System.out.print(b+1+" ");
			}
			System.out.println();
		}
	}/////////////////////////////////////////////done///////////////////////////////////////

}
