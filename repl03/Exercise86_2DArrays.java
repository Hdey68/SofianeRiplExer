package com.sofiane.repl03;

public class Exercise86_2DArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program that calculates the sum of elements from each row in a 2D array
		// and adds them into array of integers

		// For example, if we run rowSums for the following 2D array:
		// {
		// {1,1,2}, //sum = 4
		// {3,1,2}, //sum = 6
		// {3,5,3}, //sum = 11
		// {0,1,2}  //sum = 3
		// }
		// Then we should get the following array back:
		// 4
		// 6
		// 11
		// 3
///---------------------------------------------------------------------------------------------------------////		
		int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};
		for(int row=0;row<a.length;row++) {
			int sumRow=0;
		
			for(int col=0;col<a[row].length;col++){
				sumRow= sumRow+a[row][col];
	}
             System.out.println(sumRow);
}}}//////////////////////////////////////////////////////////done/////////////////////////////////////
