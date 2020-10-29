package com.sofiane.repl03;

public class Exercies75Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a program that creates an array with the following values{s, a, y,  b, n, c, t,  d, a, e, x} 
		//Print the values so the output should look like below
		/////// syntax
		
		
 		char[] array= {'s', 'a', 'y', 'b', 'n', 'c', 't', 'd', 'a', 'e', 'x'};
		
 		for(int i=0; i<array.length; i++) {
 			if(i%2==0) {
 				System.out.print(array[i]);
 			}
 		}
////////////////////////////////////////////////done///////////////////////////////////
	}

}
