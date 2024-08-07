package com.kavdu;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacter {

	public static void main(String[] args) {
		String name="helloworld";
		
		Map<Character, Long> collect = name.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	   
		 collect.entrySet().stream().forEach(System.out::println);
	
	}
}
