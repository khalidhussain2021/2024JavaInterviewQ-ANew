package com.infinte.computer.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveNullandEmpty {
	
	public static void main(String[] args) {
		List<String> asList = Arrays.asList("",null,"satyam","dixit");
		
		String str = asList.stream().filter(f->f != null && !f.isEmpty())
		.collect(Collectors.joining(","));
//	    System.out.println(str);
		  StringBuilder stringBuilder = new StringBuilder();
		for(String name : asList) {
			if(name !=null && !name.isEmpty()) {
				String[] split = name.split(",");
				System.out.println(Arrays.toString(split));
			}
		}
	}

}
