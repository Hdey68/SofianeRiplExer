package com.sofiane.repl03;

import java.util.Scanner;

public class Exercise79Arrays3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
	    String[] array = new String[7];
	    
	    for(int i=0; i<array.length; i++){
	      System.out.println("Please enter day "+ (i+1) +" of the week");
	      String day = input.nextLine();
	      array[i] = day;
	      //System.out.println(array[i]);
	    }
	    for(int i=0; i<array.length; i++){
	      System.out.println(array[i]);
	    }
	}

}
