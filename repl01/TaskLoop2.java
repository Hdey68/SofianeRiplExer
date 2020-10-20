package com.sofiane.repl01;

public class TaskLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sumO=0;
		int sumE=0;
		
		
		for(int n=1; n<=50; n++) {
			if(n%2==0) {
				sumE+=n;
			}else {
				sumO+=n;
			}
				
		}
		System.out.println("The sum of even number from 1 to 50 is "+sumE);
		System.out.println("The sum of even number from 1 to 50 is "+sumO);
	}

	}
