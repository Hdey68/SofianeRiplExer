package com.sofiane.repl01;

import java.util.Scanner;

public class Exercise37LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input;
		boolean thirsty;
		boolean sleepy;
		String drink;
		
		input=new Scanner(System.in);
		
		System.out.println("Are you thirsty?");
		thirsty=input.nextBoolean();
		System.out.println("Are you sleepy?");
		sleepy=input.nextBoolean();
		
		if(thirsty && !sleepy) {
			drink="Water";
			
		}else if(thirsty && sleepy) {
			drink="Coffee";
			
		}else if(!thirsty && sleepy) {
			drink="Tea";
			
		}else {
			drink="Nothing";
		}
			System.out.println("Looks like you need to drink "+drink);
			
		}///DONE
		

	}


