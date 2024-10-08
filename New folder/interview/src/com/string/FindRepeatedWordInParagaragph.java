package com.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindRepeatedWordInParagaragph {
	public static void main(String[] args) {
		String paragraph="i test am khalid khalid is name is is";
		findRepeatedWordInPara(paragraph);
		//using java 8
		Arrays.stream(paragraph.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().filter(entry->entry.getValue() > 1).map(e->e).forEach(e->
		
		System.out.println("Key "+e.getKey() +" value "+e.getValue()));	
	}
	//normal 
	public static void findRepeatedWordInPara(String paragraph) {
		Map<String,Integer> wordCount=new HashMap<>();
		 StringTokenizer tokenizer = new StringTokenizer(paragraph, " .,;?!");
		 while (tokenizer.hasMoreElements()) {
			String word = tokenizer.nextToken().toLowerCase();
			wordCount.put(word,wordCount.getOrDefault(word, 0)+1);
		}
		  for (Map.Entry<String,Integer> entry : wordCount.entrySet()) {
			 if(entry.getValue()> 1) {
				 System.out.println("word " + entry.getKey() +" count "+entry.getValue());
			 }
		 }
	}

	
}
