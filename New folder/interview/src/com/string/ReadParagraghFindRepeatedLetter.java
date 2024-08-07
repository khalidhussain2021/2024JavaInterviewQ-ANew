package com.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ReadParagraghFindRepeatedLetter {
	
	public static void main(String[] args) {
		
		String paragraph = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
				+ "Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. "
				+ "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris "
				+ "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in "
				+ "reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. "
				+ "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia "
				+ "deserunt mollit anim id est laborum.";
		
		Map<Character, Integer> map = new HashMap<>();
		
		paragraph = paragraph.replaceAll("[^a-zA-Z]", "").toLowerCase();
		
		for(char letter:paragraph.toCharArray()) {
			map.put(letter, map.getOrDefault(letter,0)+1);
		}
		map.entrySet().stream()
		.filter(sol->sol.getValue()>1)
		.map(Map.Entry::getKey)
		.forEach(System.out::print);
		
	}
	 
	 

}
