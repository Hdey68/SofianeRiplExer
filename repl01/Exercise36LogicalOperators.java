package com.sofiane.repl01;

import java.util.Scanner;

public class Exercise36LogicalOperators {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter two strings:");
		
		System.out.print("word1: ");
		String word1=input.next();
		
		System.out.print("word2: ");
		String word2=input.next();
		
		System.out.println("Please enter two numbers:");
		
		System.out.print("int1: ");
		int int1=input.nextInt();
		
		System.out.print("int2: ");
		int int2=input.nextInt();
		
		        if(word1.equals(word2) && int1==int2) {
		        	System.out.println("AND");
			
		        }else if(word1.equals(word2) || int1==int2) {
		        	System.out.println("OR");
			
		        }else if(word1!=word2 && int1!=int2) {
		        	System.out.println("NONE");
			
		
		}
		
	}

	}
