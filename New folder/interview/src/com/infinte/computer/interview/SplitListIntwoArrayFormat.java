package com.infinte.computer.interview;

import java.util.*;

public class SplitListIntwoArrayFormat {
	public static void main(String[] args) {
		
	        List<Integer> list = Arrays.asList(1, 2, 5, 8, 6, 7, 8);
	        List<List<Integer>> output = new ArrayList<>();
	         
	        for(int i =0;i<list.size();i+=2) {
	        	
	        	List<Integer> pairlist = new ArrayList<>();
	        	
	        	pairlist.add(list.get(i));
	        	if(i+1 < list.size()) {
	        		pairlist.add(list.get(i+2));
	        	}
	        		
	           output.add(pairlist);
	        	}
	        System.out.println(output);
	        	
	        }
	        
	    }

