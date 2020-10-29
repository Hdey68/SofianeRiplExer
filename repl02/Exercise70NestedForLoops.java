package com.sofiane.repl02;

public class Exercise70NestedForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//*Write a program to print out the pattern: 

			// Expected output:
			// 1 
			// 2 2 
			// 3 3 3 
			// 4 4 4 4 
			// 5 5 5 5 5 
		
		for(int i=1; i<=5; i++) {
			System.out.print(i+" ");
			
			for(int j=1; j<=i-1; j++) {
				System.out.print(i+" ");
				
			}
			System.out.println();
			}
			
		}//////////////////////////////////////done///////////////////////////////////////////
		
		
	}


