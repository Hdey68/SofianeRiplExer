package com.sofiane.repl03;

import java.util.Scanner;

public class Exercise80Arrays02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input=new Scanner(System.in);
		int [] num= new int[5];
		
	    for (int i=0; i<5; i++) {
	    
		num[i]=input.nextInt();
	    }
	    for(int j=4; j>=0; j--) {
	      System.out.println(num[j]);
	    }
	}

}
