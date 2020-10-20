package com.sofiane.repl01;

public class MagicTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int myNumber=50;
		int stepOne=myNumber*myNumber;
		int stepTwo=stepOne+myNumber;
		int stepThree=stepTwo/myNumber;
		int stepFour=stepThree+17;
		int stepFive=stepFour-myNumber;
		int stepSix=stepFive/6;
		String last="The magic number is ";
		System.out.println(last+stepSix+"!");
		
		
		

	}

}
