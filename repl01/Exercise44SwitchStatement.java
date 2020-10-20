package com.sofiane.repl01;

import java.util.Scanner;

public class Exercise44SwitchStatement {

	public static void main(String[] args) {
		
		Scanner input;
		String carMake;
		String carOrigin;
		input=new Scanner(System.in);
		System.out.println("Please enter your favorite car make");
		carMake=input.next();
		
		switch(carMake) {
		case "BMW":
			carOrigin="german car";
			break;
		case "Toyota":
			carOrigin="japanese car";
			break;
		case "Maserati":
			carOrigin="italian car";
			break;
			default:
				carOrigin="unknown";
		}
		System.out.println("Your favorite car is "+carOrigin);
			
			
			
		
		}/// done
		
		
		
	}


