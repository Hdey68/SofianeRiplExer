package com.sofiane.repl01;

import java.util.Scanner;

public class ExerciseScanner22 {

	public static void main(String[] args) {
		
		
	        Scanner scan=new Scanner(System.in);
	        
	        System.out.println("Entre your name");
	        String name=scan.next();
	        
	        System.out.println("Enter you mobile number");
	        String mobile=scan.next();
	        
	        mobile="571-339-9999";
	      
	        
	        System.out.println("Enter your age");
	        int age=scan.nextInt();
	        
	        System.out.println("Your name is "+name+", your age is "+age+" and your mobile number is "+mobile);

	}

}
