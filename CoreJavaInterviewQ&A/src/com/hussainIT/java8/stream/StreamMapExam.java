package com.hussainIT.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExam {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("a","b","f","m","d");
		List<String> alphaUper=new ArrayList<>();
		for(String s:list) {
			alphaUper.add(s.toUpperCase());
		}
		System.err.println(list);
		System.out.println(alphaUper);
		//using java 8
		List<String> listUpper = list.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.err.println(listUpper);
		
		List<Integer> listArr=Arrays.asList(1,4,5,9,10,100,2,5);
		List<Integer> listNum = listArr.stream().map(n->n*3).collect(Collectors.toList());
		System.err.println(listNum);
	}

}
