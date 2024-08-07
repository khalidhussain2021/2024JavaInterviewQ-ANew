package com.hussainIT; 

import java.util.Arrays;
import java.util.OptionalInt;

public class FindMaxSecondMax {

	public static void main(String[] args) throws IllegalAccessException {
		int array[] = {10,20,50,15,5};
		int maxValue = maxElementArray(array);
		System.out.println(maxValue);
		
		int maxValue2 = Arrays.stream(array).max().getAsInt();
		System.err.println(maxValue2);
		//second max element
		int secondMaxElementArray = secondMaxElementArray(array);
		System.err.println(secondMaxElementArray);
		//using java 8
		int max = Arrays.stream(array).max().getAsInt();
		int second  = Arrays.stream(array).filter(num -> num != max).max().getAsInt();
		System.out.println(second);
		
		//third max element 
		int thirdMaxElementArray = thirdMaxElementArray(array);
		System.out.println(thirdMaxElementArray);
		
		//find the all firstMax,second Max,third Max value in the array
		int[] findthethreeMaxNumber = findthethreeMaxNumber(array);
		for(int item:findthethreeMaxNumber) {
			System.err.println(item);
		}
		
	}
    public static int maxElementArray(int arr[]) {
    	if(arr.length==0) {
    		throw new IllegalArgumentException("Array is emply");
    	}
    	int max=arr[0];
    	for(int i=1;i<arr.length;i++) {
    		if(arr[i] > max) {
    			max=arr[i];
    		}
    	}
    	return max;
    }
    
    // second max element in the array 
    public static int secondMaxElementArray(int arr[]) {
    	if(arr.length<2) {
    		throw new IllegalArgumentException("Array at least 2 element is not prsent");
    	}
    	int max=Integer.MIN_VALUE;
    	int secondMax=Integer.MIN_VALUE;
    	for(int num : arr) {
    		if(num > max) {
    			secondMax=max;
    			max=num;
    		}else if(num > secondMax && num !=max) {
    			secondMax=num;
    		}
    	}
    	if(secondMax==Integer.MIN_VALUE) {
    		throw new IllegalArgumentException("No second Max number found in the array");
    	}
    	return secondMax;
    }
    
    // third max element in the array 
    public static int thirdMaxElementArray(int array[]) throws IllegalAccessException {
    	if(array.length < 3) {
    		throw new IllegalAccessException("No third Max Number in the array");
    	}
    	int firstMax=Integer.MIN_VALUE;
    	int secondMax=Integer.MIN_VALUE;
    	int thirdMax=Integer.MIN_VALUE;
    	for(int num : array) {
    		if(num>firstMax) {
    			thirdMax=secondMax;
    			secondMax=firstMax;
    			firstMax=num;
    		}else if(num > secondMax && num !=firstMax) {
    			thirdMax=secondMax;
    			secondMax=num;
    		}else if(num > thirdMax && num !=firstMax && num !=secondMax) {
    			thirdMax=num;
    		}
    	}
    	return thirdMax;
    }
    
    // find the firstmax, secondMax, thirdMax element in the array 
    public static int[] findthethreeMaxNumber(int array[]) throws IllegalAccessException {
    	if (array.length < 3) {
    		throw new IllegalAccessException("Empty or less Element in the array");
    	}
    	int firstMax1=Integer.MIN_VALUE;
    	int secondMax1= Integer.MIN_VALUE;
    	int thirdMax1= Integer.MIN_VALUE;
    	for(int num :array) {
    		if(num > firstMax1) {
    			thirdMax1=secondMax1;
    			secondMax1=firstMax1;
    			firstMax1=num;
    		} else if(num > secondMax1 && num !=firstMax1) {
    			thirdMax1=secondMax1;
    			secondMax1=num;
    		} else if(num > thirdMax1 && num !=firstMax1 && num !=secondMax1) {
    			thirdMax1=num;
    		}
    	}
    	return new int[] {firstMax1,secondMax1,thirdMax1};
    }
} 
