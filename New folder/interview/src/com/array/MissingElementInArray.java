package com.array;

import java.util.Arrays;

public class MissingElementInArray {
	
	public static void main(String[] args) {
		Integer[] input1= {1,2,3,4,6};
		
		  int n=   input1.length+1;
		  int sum = n * (n+1)/2;
		  
		  int actualSum=0;
		  for(int num : input1) {
			  actualSum+=num;
		  }
		  System.out.println(sum - actualSum);
		  
	}

}
