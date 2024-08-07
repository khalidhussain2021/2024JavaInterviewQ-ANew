package com.string;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OcurranceLetterInString {
     public static void main(String[] args) {
		String str="khalid";
		Map<Character, Long> countList = str.chars().mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(countList);
		occurenceLetterInStr(str);
	}
    public static void occurenceLetterInStr(String str) {
    	Map<Character,Integer> occurenceChar =new HashMap<>();
    	char[] charArray = str.toCharArray();
    	for(char c: charArray) {
    		if(occurenceChar.get(c)==null) {
    			occurenceChar.put(c, 1);
    		}else {
    			occurenceChar.put(c, occurenceChar.get(c)+1);
    		}
    	}
    	for(Map.Entry<Character, Integer> entry: occurenceChar.entrySet()) {
    		System.out.println(" character occurencr of the "+ entry.getKey() + " count of the occuence "+entry.getValue());
    	}
    	
    }
    
}
