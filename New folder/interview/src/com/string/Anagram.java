package com.string;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		String s1="silent";
		String s2="listen";
		
		char[] first=s1.toCharArray();
		  char[] second=s2.toCharArray();
		  
		  Arrays.sort(first);
		  Arrays.sort(second);
		  
		  if(Arrays.equals(first, second)) {
			  System.out.println("Anagram");
		  }else {
			  System.out.println("Not Anagram");
		  }
		  
	}

}
