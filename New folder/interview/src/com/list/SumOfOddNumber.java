package com.list;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class SumOfOddNumber {
   public static void main(String[] args) {
	  List<Integer> inputInt = Arrays.asList(1,2,3,4,5,6,7,8,9);
	  //sum of odd number
	   int sum = inputInt.stream().filter(o->o%2==1).mapToInt(Integer::intValue).sum();
	  System.out.println(sum);
	  
	  // max value
	  OptionalInt max = inputInt.stream().mapToInt(Integer::intValue).max();
       if(max.isPresent()) {
    	System.out.println(max);   
       }else {
    	   System.out.println("Not Found");
       }
   }
}
