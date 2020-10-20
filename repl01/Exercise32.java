package com.sofiane.repl01;

import java.util.Scanner;

public class Exercise32 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please entre your gender:M or F");
        char gender=input.next().charAt(0); 
		
		System.out.println("Please enter your age");
		int age=input.nextInt();
		
		if(age>25) {
		if(gender=='F') {
			System.out.println("Woman");
		}else {
			System.out.println("Man");
		}
		}
		if(age<25) {
			if(gender=='F') {
			System.out.println("Girl");
		}else {
			System.out.println("Boy");
			
			//DONE
		}
		}
		
}
		
	
}
	
		