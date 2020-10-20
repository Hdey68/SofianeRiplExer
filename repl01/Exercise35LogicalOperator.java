package com.sofiane.repl01;

import java.util.Scanner;

public class Exercise35LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		String result="score";
		System.out.println("Do you need a loan?");
		boolean needLoan=input.nextBoolean();
		
		if(needLoan) {
			System.out.println("What is your credit score?");
			int score=input.nextInt();
			
			if(score<600) {
				result="Not eligible";
				}else if(score>=600 && score<=700) {
				result="Maybe eligible";
				}else if(score>=701 && score<=800) {
				result="Eligible";
				}else if(score>=801) {
				result="Definitely eligible";
				}
			System.out.println("The eligibility is "+result);
	  }else {
			System.out.println("The eligibility is Unknown");
			}
		  }
        }


