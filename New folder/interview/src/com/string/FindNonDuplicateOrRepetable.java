package com.string;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindNonDuplicateOrRepetable {
	public static void main(String[] args) {
		String name="helloworlds";
		char[] charArray = name.toCharArray();
		Map<Character,Integer> map= new HashMap<>();
		for(char c:charArray) {
			if(map.get(c)==null) {
			map.put(c, 1);
			}
			else {
				map.put(c, map.get(c)+1);
				}
			}
		 for(Map.Entry<Character,Integer> en:map.entrySet()) {
			 if(en.getValue()>1) {
				 System.out.println( en.getKey() +" key -->" + en.getValue() +" values");
			 }
		 }
		
		//using java 8
		 Map<Character, Long> result = name.chars().mapToObj(c->(char)c).
		 collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		 .entrySet().stream().filter(entry->entry.getValue()>1).collect(Collectors.toMap(Entry::getKey,Entry::getValue));
		 System.err.println(result);
		 
		List<String> collect2 = Arrays.stream(name.split(""))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream()
		.filter(value->value.getValue()==1)  // remove duplicate .filter(value->value.getValue()>1)
		.map(Map.Entry::getKey)
		.collect(Collectors.toList());
		System.out.println(collect2);
			
		}
	
	}
