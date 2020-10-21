package com.sofiane.repl02;

public class Exercise68NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //For you to do: 
		//Write a program to print out the pattern: 

			//Expected output:
			//1 
			//1 2 
			//1 2 3 
			//1 2 3 4 
			//1 2 3 4 5 
			//1 2 3 4 5 6 
			//1 2 3 4 5 6 7
		
		for(int i=1; i<=7;i++) {
			
			for(int j=0; j<i; j++) {
				System.out.print(j+1+" ");
			}
		System.out.println();
		} //////////////////////////////////////////////////////done///////////////////////////
		
	}

}
