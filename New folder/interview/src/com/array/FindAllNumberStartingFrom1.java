package com.array;


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindAllNumberStartingFrom1 {
	public static void main(String[] args) {
		
//		[10,15,8,49,25,98,32] Given a list of integers, find out all the numbers starting with 1 using Stream functions?

		Integer[]numbs={10,15,8,49,25,98,32,191};
		
		List<String> collect = Arrays.stream(numbs).map(s->s +" ").filter(s->s.startsWith("1")).collect(Collectors.toList());
	
	    System.out.println(collect);
	    

//Given a String "ABCDEFBCDDEE", find the first repeated character in it using Stream functions
	
	String name="ABCDEFBCDDEE";
	Set<Character>  seenAdd=new HashSet<>();
			Character result = name.chars().mapToObj(c->(char)c).filter(c->!seenAdd.add(c)).findFirst().orElse(null);
	 System.out.println(result);
	    
	}

}
