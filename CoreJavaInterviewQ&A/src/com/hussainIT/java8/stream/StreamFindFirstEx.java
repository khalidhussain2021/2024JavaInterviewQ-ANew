package com.hussainIT.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamFindFirstEx {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,5,90,10,88,100);
		Optional<Integer> firstElement = list.stream().findFirst();
		if(firstElement.isPresent()) {
			System.out.println(firstElement.get());
		}else {
			System.err.println("value is not exist");
		}
		
		Optional<Integer> any = list.stream().findAny();
		if(any.isPresent()) {
			System.out.println(any.get());
		}else {
			System.err.println(" value is not present");
		}
		
		long count = list.stream().count();
		System.err.println(count);
		
		Integer minInt = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(minInt);
		
		Integer max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(max);
	}

}
