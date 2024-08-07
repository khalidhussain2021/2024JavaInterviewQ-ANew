package com.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListUniqueAndSort {
public static void main(String[] args) {
	
	List<Integer> asList = Arrays.asList(7,7,7,7,7,3,3,3,2,2,2);
	
	ArrayList<Integer> list = new ArrayList<>();
	
	for(Integer no:asList) {
		if(!list.contains(no)) {
			list.add(no);
		}
		
	}
	
	Collections.sort(list);
	System.out.println(list);
     List<Integer> res = list.stream().sorted().collect(Collectors.toList());
     System.out.println(res);
     
}
}
