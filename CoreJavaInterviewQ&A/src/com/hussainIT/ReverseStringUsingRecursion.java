package com.hussainIT;

public class ReverseStringUsingRecursion {
	public static void main(String[] args) throws Exception {
		String str="khalid";
		String reverseString = reverseString(str);
		System.err.println(reverseString);
 	}
	public static String reverseString(String str) throws Exception {
		if(str==null || str.isEmpty()) {
		 throw new Exception("String is empty");
		}
		if(str.length()==1) {
			return str;
		}
	return reverseString(str.substring(1))+str.charAt(0);
	}
}
