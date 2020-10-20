package com.sofiane.repl01;

import java.util.Scanner;

public class Exercise38LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input;
		boolean weekend;
		String subject;
		
		input=new Scanner(System.in);
		System.out.println("Is it weekend?");
		weekend=input.nextBoolean();
		
		if(!weekend) {
			subject="Manual testing";
		}else {
			subject="Java";
			
		}
		System.out.println("Today you will be learning "+subject);

	}//DONE

}
