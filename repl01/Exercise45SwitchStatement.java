package com.sofiane.repl01;

import java.util.Scanner;

public class Exercise45SwitchStatement {

	public static void main(String[] args) {
		
		
	Scanner input;
	int number;
	String dayOfWeek;
	input=new Scanner(System.in);
	System.out.println("Input a number between 1-7");
	number=input.nextInt();
	
	switch(number) {
	
	case 1:
		dayOfWeek="Monday";
		break;
	case 2:
		dayOfWeek="Tuesday";
		break;
	case 3:
		dayOfWeek="Wednesday";
		break;
	case 4:
		dayOfWeek="Thursday";
		break;
	case 5:
		dayOfWeek="Friday";
		break;
	case 6:
		dayOfWeek="Saturday";
		break;
	case 7:
		dayOfWeek="Sunday";
		break;
		default:
			dayOfWeek="Invalid";
	}System.out.println(dayOfWeek);
		
	}///DONE
		
		
	}


