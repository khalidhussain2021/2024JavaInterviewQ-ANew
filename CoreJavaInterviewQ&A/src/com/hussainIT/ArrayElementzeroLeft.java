package com.hussainIT;

//Integer array[] =[1,1,0,1,0] -> output : [0,0,1,1,1]


public class ArrayElementzeroLeft {
	public static void main(String[] args) {
		 int arr[] = {1, 1, 0, 1, 0};
	        int countZero = 0;

	        // Count the number of 0s in the array
	        for (int num : arr) {
	            if (num == 0) {
	                countZero++;
	            }
	        }

	        // Fill the array with 0s for the first countZero positions
	        for (int i = 0; i < countZero; i++) {
	            arr[i] = 0;
	        }

	        // Fill the rest of the array with 1s
	        for (int i = countZero; i < arr.length; i++) {
	            arr[i] = 1;
	        }

	        // Print the sorted array
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	}
}
