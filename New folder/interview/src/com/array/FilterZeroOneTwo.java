package com.array;

import java.util.ArrayList;
import java.util.ArrayList.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterZeroOneTwo {
	
	public static void main(String[] args) {
		Integer [] input= {0,0,0,0,1,1,1,1,2,2,2,2,0,0,0,2,2,2,1,1,1};
		
		List<Integer> arrayList = new ArrayList<>();
		
		for(int i=0;i<input.length;i++) {
			if(input[i]==0) {
				arrayList.add(input[i]);
			}
			}
		for(int i=0;i<input.length;i++) {
			if(input[i]==1) {
				arrayList.add(input[i]);
			}
			
	}
		for(int i=0;i<input.length;i++) {
			if(input[i]==2) {
				arrayList.add(input[i]);
			}
		}
		//using java 8 
		List<Integer> arrayList2 = Arrays.stream(input).sorted().collect(Collectors.toList());
		System.out.println(arrayList2);
  System.out.println(arrayList);
	}
}
