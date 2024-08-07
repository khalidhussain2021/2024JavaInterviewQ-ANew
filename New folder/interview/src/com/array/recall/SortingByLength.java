package com.array.recall;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingByLength {
	
	public static void main(String[] args) {
		String inputList [] = {"X", "XXXX", "XXXXX", "XX","AAA", "XXX"};
	
	  Arrays.sort(inputList,Comparator.comparing(String::length));
	  System.out.println(Arrays.toString(inputList));
	  
	  List<String> input = Arrays.asList("X", "XXXX", "XXXXX", "XX","AAA", "XXX");
	  
	  List<String> collect = input.stream().sorted(Comparator.comparing(String :: length))
			  .collect(Collectors.toList());
	
	   System.out.println(collect);
	}

}
