package com.infinte.computer.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertListToListOfList {
  public static void main(String[] args) {
	
	  List<Integer> intList = Arrays.asList(1,2,3,4,5,6);
	   List<List<Integer>> result =convertListtoListOfList(intList);
	   System.out.println(result);
}
  
  public static List<List<Integer>> convertListtoListOfList(List<Integer> list){
	  
	  List<List<Integer>> arrayList = new ArrayList<>();
	    for(int i=0;i<list.size();i++) {
	    	List<Integer> subList = new ArrayList<>();
	    	subList.add(i);
	    	arrayList.add(subList);
	    }
	  
	  return arrayList;
  }
}
