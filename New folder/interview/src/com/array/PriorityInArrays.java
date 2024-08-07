package com.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PriorityInArrays {
public static void main(String[] args) {
	int[] array= {12,14,16,25,3,4,4,4,2,2,3,6,7,2,5,4,3,6,7,8,3,4,5,45,34,43,40};
	Arrays.sort(array);
	,
	Map<Integer,Integer> countOccurance=new HashMap<>();
	
	for(int num : array) {
		
		countOccurance.put(num, countOccurance.getOrDefault(num, 0) + 1);
	}
	
	int leastOccurance =array[0];
	int moderateOccurance = array[array.length/2];
	int mostOccurace=array[array.length-1];
	
	Set<Entry<Integer,Integer>> entrySet =countOccurance.entrySet();
	
	for(Entry<Integer,Integer> entry : entrySet) {
    	  if(entry.getValue()> mostOccurace) {
    		  mostOccurace=entry.getValue();
    		  entry.getKey();
    	  }
	System.out.print(countOccurance.get(leastOccurance));
	
//	System.out.print(countOccurance.get(moderateOccurance));
	
//  System.out.print(countOccurance.get(mostOccurace));
	}
	
	
    }//amin
	
	
}

