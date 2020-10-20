package com.sofiane.repl01;

import java.util.Scanner;

public class Exercise28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter the lenth");
		int l=input.nextInt();
		System.out.println("Please enter the width");
		int w=input.nextInt();
		
		if(l==w) {
			System.out.println("The shape of you object is square");
		}else {
			System.out.println("The shape of your object is rectangle");
			
		}
		
		//DONE

	}

}
