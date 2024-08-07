package com.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindCommonElementFromTwoArray {
	
	public static void main(String[] args) {
		
		Integer[] input1= {1,2,3,4,6};
		Integer[] input2= {2,3,6,8,9};
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int inp1 : input1) {
			set.add(inp1);
		}
		
		HashSet<Integer> commonSet = new HashSet<>();
		for(int inp2: input2) {
			if(set.contains(inp2)) {
				commonSet.add(inp2);
			}
		}
		System.out.println(commonSet);
		// using java 8
		Set<Integer> collect = Arrays.asList(input1).stream().filter(Arrays.asList(input2)::contains).collect(Collectors.toSet());
	     System.out.println(collect);
	
	}

}
