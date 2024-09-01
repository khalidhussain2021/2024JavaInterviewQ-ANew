package com.hussainIT;

import java.util.Arrays;

public class SumOfNegativeElementOfArray {
	public static void main(String[] args) {
		 int[] numbers = {3, 1, -4, 2, -6, 5, -3};
	        int sum = 0;

	        for (int number : numbers) {
	            if (number < 0) {
	                sum += number;
	            }
	        }

	        System.out.println("Sum of negative elements: " + sum);
	        //using java 8 
	        int sum1 = Arrays.stream(numbers)
                    .filter(n -> n < 0)  // Filter negative numbers
                    .sum(); 
	        System.err.println(sum1);
	}

}
