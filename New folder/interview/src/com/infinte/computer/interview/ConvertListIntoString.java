package com.infinte.computer.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertListIntoString {
	
	public static void main(String[] args) {
		List<Integer> listInt = Arrays.asList(1,2,3,4,5);
		
		String result = convertListIntoStirng(listInt);
		System.out.println(result);
	}
	
	public static String convertListIntoStirng(List<Integer> list) {
		
		 StringBuilder sb= new StringBuilder();
		for(int i=0 ;i<list.size();i++) {
			sb.append(list.get(i));
		}
		
		return sb.toString();
	}

}
