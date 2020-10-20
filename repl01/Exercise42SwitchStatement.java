package com.sofiane.repl01;

import java.util.Scanner;

public class Exercise42SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input;
		short rollNumber;
		String print;
	
		input=new Scanner(System.in);
		System.out.println("Enter the roll number of the child");
		rollNumber=input.nextShort();
		
		switch(rollNumber) {
		
		case 101:
			print="Student name: Ramesh";
			break;
		case 102:
			print="Student name: Mahesh";
			break;
		case 103:
			print="Student name: Mukesh";
			break;
			default:
				print="Not found Student name: in Class";
		}
		System.out.println(print);
				
		}	// DONE
	}


