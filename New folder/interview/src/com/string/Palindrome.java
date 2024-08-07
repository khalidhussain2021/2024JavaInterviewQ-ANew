package com.string;

public class Palindrome {
 
	
	public static void main(String[] args) {
		String input="radar";
		String rev="";
		for(int i=input.length()-1;i>=0;i--) {
			 
			rev+=input.charAt(i);
			
		}
		
		if(input.toLowerCase().equals(rev.toLowerCase())){
			System.out.println("String palindrome");
		}else{
			System.out.println("String Not pallindrome");
		}
		
	}
}
