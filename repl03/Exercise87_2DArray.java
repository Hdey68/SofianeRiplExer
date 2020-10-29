package com.sofiane.repl03;

public class Exercise87_2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// For you to do:
			// Write a program that prints the total number of elements that are negative AND odd

			 // Output:
			// 3
		
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
		int sum = 0;
          for(int r=0;r<a.length;r++) {
        	  for(int c=0;c<a[r].length;c++) {
        		  
        		  if(a[r][c]<0 && a[r][c]%2!=0) {
        		
        		   sum+=1;
        		  }
       }
          }			
					System.out.println(sum);  
        		  }
        ////////////////////////////////////////////done////////////////////////////////////////////
        	  }
	 
          
	


