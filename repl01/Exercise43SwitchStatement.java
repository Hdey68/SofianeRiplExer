package com.sofiane.repl01;

import java.util.Scanner;

public class Exercise43SwitchStatement {

	public static void main(String[] args) {
	
		
		  Scanner input;
		  int month;
		  String display;
		  display="month";
		  
		  input=new Scanner(System.in);
		  System.out.println("Input a number between 1-12");
          month=input.nextInt();
          
		  switch(month) {
		  
		  case 1:
		      display="January";
		      break;
		  case 2:
		      display="February";
		      break;
		  case 3:
			  display="March";
			  break;
		  case 4:
			  display="April";
			  break;
		  case 5:
			  display="May";
			  break;
		  case 6:
			  display="June";
			  break;
		  case 7:
			  display="July";
			  break;
		  case 8:
			  display="August";
			  break;
		  case 9:
			  display="September";
			  break;
		  case 10:
			  display="October";
			  break;
		  case 11:
			  display="November";
			  break;
		  case 12:
			  display="December";
			  break;
			  default:
				  display="Invalid";
				  
				  
			  
		  
		  
		  } System.out.println(display);
		  
	}

}
