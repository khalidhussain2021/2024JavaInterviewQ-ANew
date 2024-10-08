package com.array;

import java.util.Arrays;
import java.util.Comparator;

public class LargestStringFinder {
	public static void main(String[] args) {
		
		String[] strings = {"apple", "banana","strawberry", "orange" };
		 String largestString = strings[0]; // Initialize with the first string

	        for (String str : strings) {
	            if (str.length() > largestString.length()) {
	                largestString = str; // Update largestString if a longer string is found
	            }
	        }
	        System.out.println("Largest string: " + largestString);
	        
	        //java 8 
	       String largestString2 = Arrays.stream(strings).
	    		   max(Comparator.comparingInt(String::length)).get();
	       System.err.println(largestString2);
	}
	

}
