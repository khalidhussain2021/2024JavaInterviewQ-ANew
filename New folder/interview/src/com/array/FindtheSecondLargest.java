package com.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindtheSecondLargest {
public static void main(String[] args) {
	Integer [] input ={10,14,13,11,12,30,24,30,25};
	
	List<Integer> listInt = Arrays.asList(input).stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
     listInt.stream().distinct();
	Integer scondElemt = Arrays.asList(input).stream().sorted(Comparator.reverseOrder()).distinct().skip(3).findFirst().get();
	System.err.println(scondElemt);
	System.out.println(listInt.get(2));
}
}
