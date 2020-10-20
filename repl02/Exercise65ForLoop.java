package com.sofiane.repl02;

import java.util.Scanner;

public class Exercise65ForLoop {

	public static void main(String[] args) {
		
		
		 Scanner input;
		    int x = 0;
		    System.out.print("In:");
		    input=new  Scanner(System.in);
		    x=input.nextInt();
		    
		    for(int i=x-1; i>=0; i--) {
		    	System.out.print(i+" ");
		    }
	}///////////////////////////////////////////////////DONE////////////////////////////////////////////////////////

}
