package com.sofiane.repl01;

import java.util.Scanner;

public class Exercise41SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner input;
		int age=0;
		String print;
		
		input=new Scanner(System.in);
		System.out.println("Enter the age of the child");
		age=input.nextInt();
		
		switch(age) {
		
		case 1:
			print="You can Crawl";
			break;
		case 2:
			print="You can Talk";
			break;
		case 3:
			print="You can Dance";
			break;
		case 4:
			print="You can get Trouble";
			break;
			default:
				print="I don't know how old you are";
		}
		System.out.println(print);
		}
	}///DONE


