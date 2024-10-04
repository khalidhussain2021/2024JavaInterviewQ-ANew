package com.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MapSorting {
	public static void main(String[] args) {
		    //list sorting  java 8
			List<Employee> empList = Arrays.asList(new Employee(1l, "us",21d,30),new Employee(4l, "indi", 33d,44), new Employee(3l, "ukk",48d,90));
		
			List<Employee> collect = empList.stream().sorted(Comparator.comparing(Employee::getName).reversed()).filter(c->c.getName().length()>0).collect(Collectors.toList());
		
			System.out.println(collect);
			
			//map sorting using java 8 
			
	          Map<String,Integer> map=new HashMap<>();
	          map.put("abc",3);
	          map.put("cde", 5);
	          map.put("efg",9);
			  Map<String, Integer> collect1 = map.entrySet().stream().
					  sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).
					  collect(Collectors.toMap(Entry::getKey, Entry::getValue,(oldKey,newKey)->oldKey,LinkedHashMap::new));
			  
		     System.out.println(collect1);
	}

}
