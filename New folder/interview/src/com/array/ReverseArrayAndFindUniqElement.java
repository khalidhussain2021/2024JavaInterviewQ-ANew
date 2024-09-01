package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
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
		
		findTheUniquevalueList();
		
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
	
	//find the unique value using in the arrayList
	
	private static void findTheUniquevalueList() {
		List<Integer> list=Arrays.asList(12,4,5,8,9,12,88,90,90,1,90);
		List<Integer> result=new ArrayList<>();
		for(Integer e:list) {
			if(!result.contains(e)) {
				result.add(e);
			}
		}
		System.err.println(result);
	}

}
