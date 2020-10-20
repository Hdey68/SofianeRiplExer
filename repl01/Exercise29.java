package com.sofiane.repl01;

import java.util.Scanner;

public class Exercise29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter first number");
		int x=input.nextInt();
		
		System.out.println("Please enter second number");
		int y=input.nextInt();
		
		if(x*y>0) {
			System.out.println("true");
			
		}else {
			System.out.println("false");
		}
		
		//DONE

	}

}
