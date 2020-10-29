package com.sofiane.repl03;

public class Exercise74Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a program that creates an array of integers that stores the following values:
		//45,78, 12,  67, 55, 89, 23, 77, 88
		//Print only values that stored with even index including 0.
		
		int[] integ= {45,78,12,67,55,89,23,77,88};
		
		for(int i=0; i<integ.length; i++) {
			
			if(i%2==0) {
					
					System.out.print(integ[i]+" ");
		}

		}}/////////////////////////////////DONE///////////////////////////////////
		
	}


