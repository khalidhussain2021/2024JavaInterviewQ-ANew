package com.hussainIT.java8.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamObjectDemo {
	public static void main(String[] args) {
		
		//create a stream 
		Stream<String> stream = Stream.of("a","b","d","f");
		stream.forEach(System.out::println);
		
		//creating stream from source
		List<String> lists = Arrays.asList("JAVA","ANG","SPRING","HIBERNATE");
		Stream<String> listSteam = lists.stream();
		listSteam.forEach(System.out::println);
		
		Collection<Integer> list1 = Arrays.asList(1,5,8,9,0);
		Stream<Integer> intStrm = list1.stream();
		intStrm.forEach(System.out::println);
		
		List<Double> doubleList=Arrays.asList(12.9,12.99,90.008,120.888);
		Set<Double> doubleSet=new HashSet<>(doubleList);
		Stream<Double> stream2 = doubleSet.stream();
		stream2.forEach(System.out::println);
		
		String [] strArr= {"a","b","c","d","s","g"};
		Stream<String> stream3 = Arrays.stream(strArr);
		stream3.forEach(System.out::print);
		
		
	}
}
