package com.sofiane.repl01;

import java.util.Scanner;

public class Exercise33 {

	public static void main(String[] args) {

       Scanner input=new Scanner(System.in);
       
       System.out.println("Please enter a number");
       int value=input.nextInt();
       
       if(value%2==0) {
    	   System.out.println("Value is even");
    	   
                
    	       if(value>1000) {
    	    	   System.out.println("Even number is large");
    	       }else {
    	    	   System.out.println("Even value is just right");
    	    	   }
    	       }else {
    	    	   System.out.println("Value is odd");  
    	       }
	
	    
	    	
	    		//DONE
	    		
	    	
	    		
	    	}
	    		
    	   
       }
       

	


