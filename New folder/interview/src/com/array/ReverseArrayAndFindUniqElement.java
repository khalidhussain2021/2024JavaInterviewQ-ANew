package com.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseArrayAndFindUniqElement {
	
	public static void main(String[] args) {
	//first senario	
		Integer[] array = {1,2,3,4,5,6};
		Integer numb = array.length;
		int [] temp = new int[numb];
		
		for(int i=numb-1;i>=0;i--) {
			   temp[numb-i-1]=array[i];
		}
		System.out.println(Arrays.toString(temp));
		
        Integer[] input = {1,2,1,2,3,4,5,6,4};
		
		
		System.out.println(uniquElement(input));

		
	}
	//second senario	

	private static Set<Integer> uniquElement(Integer[] input) {
		   
		 Set<Integer> hashSet = new HashSet<>();
		
		 for(int i=0;i<input.length;i++) {
			 if(!hashSet.add(input[i])) {
				 hashSet.add(input[i]);
			 }
		 }
		return hashSet;
	}

}
