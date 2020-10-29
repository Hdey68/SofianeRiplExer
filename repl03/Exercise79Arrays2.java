package com.sofiane.repl03;

import java.util.Scanner;

public class Exercise79Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter day 1 of the week ");		
		String day1=input.next();
		System.out.println("Please enter day 2 of the week ");	
		String day2=input.next();
		System.out.println("Please enter day 3 of the week ");	
		String day3=input.next();
		System.out.println("Please enter day 4 of the week ");	
		String day4=input.next();
		System.out.println("Please enter day 5 of the week ");	
		String day5=input.next();
		System.out.println("Please enter day 6 of the week ");	
		String day6=input.next();
		System.out.println("Please enter day 7 of the week ");	
		String day7=input.next();		
				
		String[] dayOfWeek= {"1","2","3","4","5","6","7"};
		String[] days= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		for(int i=0; i<days.length; i++) {
			System.out.println(days[i]);
		}
		///////////////////////////////////////////done////////////////////////////////////

	}

	}
