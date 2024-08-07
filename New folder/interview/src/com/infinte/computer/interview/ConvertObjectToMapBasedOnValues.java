package com.infinte.computer.interview;

import java.util.HashMap;
import java.util.Map;

public class ConvertObjectToMapBasedOnValues {
	
	public static void main(String[] args) {
		  
		Person p= new Person(1l,"rksh");
		Map<String,Object> map=convertObjectToMapBasedOnValues(p);
		System.out.println(map);
		
	}
	
	public static Map<String,Object> convertObjectToMapBasedOnValues(Person p){
		
		 HashMap<String, Object> hashMap = new HashMap<>();
		 hashMap.put("rksh", p);
		return hashMap;
	}

}
