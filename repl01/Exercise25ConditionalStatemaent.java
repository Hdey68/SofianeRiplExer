package com.sofiane.repl01;

import java.util.Scanner;

public class Exercise25ConditionalStatemaent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("In:");
		int num=input.nextInt();
		
		if(num>0) {
			System.out.println(num+" is positive");
			
		}if(num<0) {
			System.out.println(num+" is negative");	
		
		}if(num==0){
			System.out.print("Entered number is equals to 0");
				
				
				
			
		}
		
		//DONE

	}

}
