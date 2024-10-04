package com.hussainIT;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveSpaceanddotandfindDup {

	public static void main(String[] args) {
		String text = "This is a sample text. This text has some words that repeat. The word 'this' appears multiple times in this text.";
	    String text1=text.replace(".", "");
		String[] words = text1.split("\\s+");
	     Map<String, Long> result = Arrays.stream(words).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
	    .entrySet().stream().filter(entry->entry.getValue()>1)
	    .map(e->e).collect(Collectors.toMap(Entry::getKey, Entry::getValue));
	     System.out.println(result);
	    
		 
	}

}
