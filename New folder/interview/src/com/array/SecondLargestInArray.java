package com.array;

import java.util.Arrays;

public class SecondLargestInArray {
	public static void main(String[] args) {
		
		int[] input= {20,30,10,40,80,70};
		int max=Integer.MIN_VALUE;
		int maxSecond=Integer.MIN_VALUE;
		
		for(int num : input) {
			if(num > max) {
				maxSecond=max;
				max=num;
			}else if(num > maxSecond && num !=max) {
				maxSecond=num;
			}
		}
		System.err.println(maxSecond);
//		int [] input= {-1,-3,-6,-8,-9};
//		Arrays.sort(input);
//		int secondLargest=input[input.length -2];
//		System.out.println(secondLargest);
		
	}
	

}
