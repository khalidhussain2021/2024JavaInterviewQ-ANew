package com.list;

import java.util.Arrays;
import java.util.List;

public class MiddleElementFindFromList {
 public static void main(String[] args) {
	 List<Integer> listInt = Arrays.asList(10,20,30,40,50,60,70);
	 
	 int middle=0;
	 
	  for(int i=0;i<listInt.size();i++) {
		  middle=listInt.get(i/2);
	  }
	  System.out.println(middle);
}
}
