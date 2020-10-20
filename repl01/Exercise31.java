package com.sofiane.repl01;

import java.util.Scanner;

public class Exercise31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Is it sunny outside?");
		boolean value=input.nextBoolean();
				
		if(value) {
			System.out.println("It is sunny day, I should go somewhere!");
             System.out.println("What is the temperature ouside?");	
             
			int temp=input.nextInt();
			
			if(temp>85) {
				System.out.println("I am going to the beach");
			}else {
				System.out.println("I am going to the park!");
			}
		}else {
			System.out.println("I stay home and practice Java");
			
		}
		
			//DONE
		}
		
	}


