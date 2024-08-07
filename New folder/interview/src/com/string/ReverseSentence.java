package com.string;

public class ReverseSentence {
	public static void main(String[] args) {
		String input="Welcome to India";
		
		String[] revMsg= input.split("\\s+");
		
		StringBuilder reverseString = new StringBuilder();
		
		String output="";
		
		for(int i=revMsg.length-1;i>=0;i--) {
			  output = reverseString.append(revMsg[i]).append(" ").toString().trim();
			 
		}
		
		System.out.println(output);
	}

}
