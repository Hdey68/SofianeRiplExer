package com.sofiane.repl02;

public class Exercise72NestedForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Write a program to print out the pattern: 

		// Expected output:
		//  $$$$
		//	$  $
		//  $  $
		//	$$$$
		for(int i=1; i<=4; i++) {
			
		      for(int j=1; j<=4; j++) {
		    	  
		        if(j==1 || j==4 || i==1 || i==4) {	
		          System.out.print("$");
		          
		        }else {
		        	
		          System.out.print(" ");
		        }
		      }
		      System.out.println();
		    }
		
		////////////////////////////////////////done//////////////////////////////////////////
	}

}
