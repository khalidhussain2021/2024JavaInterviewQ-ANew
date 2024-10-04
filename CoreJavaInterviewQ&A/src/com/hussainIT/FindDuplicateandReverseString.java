package com.hussainIT;

import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateandReverseString {
	
	//String str="alrimatriks"; given string find the duplicate element and reverse the string out put ="amirla using java 8 stream api
	public static void main(String[] args) {
		
		String str="alrimatriks";  //out amirla
		String res=  str.chars().mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().filter(entry->entry.getValue()>1)
		.map(Map.Entry::getKey)
		.map(String::valueOf).
		collect(Collectors.joining());
		String reversed = new StringBuilder(res).reverse().toString();

        // Output the result
        System.out.println(reversed); 
		
	}
}
