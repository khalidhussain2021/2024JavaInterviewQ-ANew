package com.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapIntoListAndListIntoMap {

	public static void main(String[] args) {
		//can we take map into list
		// basic operation demonstrates how to store lists as values in a HashMap
		Map<String,List<Integer>> hashMap = new HashMap<>();
		
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);	
	hashMap.put("key1",arrayList );
    System.out.println(hashMap);
	
	 // can we take list into map
	
	   ArrayList<Map<String,Integer>> arrayList2 = new ArrayList<>();
	   
	   Map<String,Integer> map= new HashMap<>();
	   map.put("dixit", 1);
	   map.put("satyam", 2);
	   
	   arrayList2.add(map);
	   System.out.println(arrayList2);
	
	
	}

}
