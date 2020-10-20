package com.sofiane.repl01;

import java.util.Scanner;

public class ScannerPratictice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myScanner=new Scanner(System.in);
		
		System.out.println("please enter your Name");
		String name=myScanner.next();
		
		System.out.println("Please enter your age");
		int age=myScanner.nextInt();
		
		System.out.println("Please entre your city");
		String city=myScanner.next();
		
		System.out.println("Your name is "+name+" your age "+age+" years old and live in "+city);
		
		
		
		
		
		
		
		

	}

}
