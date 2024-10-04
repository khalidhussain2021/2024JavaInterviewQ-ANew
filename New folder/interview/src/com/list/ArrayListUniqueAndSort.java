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
	//without using predefine method
	for(int i=0;i<list.size();i++) {
		  for(int j=0;j<i;j++) {
			  int temp=list.get(j);
			  if(list.get(j) > list.get(j+1)) {
				  list.set(j, list.get(j+1));
				  list.set(j+1,temp);
			  }
		  }
		}
	//using collections method
	Collections.sort(list);
	System.out.println(list);
     List<Integer> res = asList.stream().sorted().distinct().collect(Collectors.toList());
     System.out.println(res);
     
}
}
