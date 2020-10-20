package com.sofiane.repl01;

import java.util.Scanner;

public class Exercise40SwitchStatement {

	public static void main(String[] args) {
		/*For you to do: Switch Statement

By using the switch statement concept please validate what is the responsibility each instructor in the syntax solution.

First Output: "Enter name of the instructor"

case 1: if User provided the name as Asghar as input it should show  "Will take care of Java Assignment"
case 2: if User provided the name as Moazam as input it should show  "Will take care of SDLC Assignment"
case 3: if User provided the name as Weqas as input it should show  "Will take care of Selenium Assignment"
case 4: if User provided the name as Asel as input it should show  "Will take care of every Assignment"

Other than these four names if the user provides any other names -->
		 */
		
		Scanner input;
		String name;
		
		input=new Scanner(System.in);
		System.out.println("Enter name of the instructor");
		name=input.next();
		String assignment;

		switch(name) {
		
		case "Asghar":
			assignment="Will take care of Java Assignment";
			break;
		case "Moazam":
			assignment="Will take care of SDLC Assignment";
			break;
		case "Weqas":
			assignment="Will take care of Selenium Assignment";
			break;
		case "Asel":
			assignment="Will take care of every Assignment";
			break;
			default:
				assignment="Invalid instructor selected";
				
		}
		System.out.println(assignment);
		
		

	}// DONE

}
