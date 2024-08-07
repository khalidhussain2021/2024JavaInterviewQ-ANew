package com.array;

import java.util.Arrays;
import java.util.List;

public class FindTheWordStartAndEndWithSameCharacter {

	public static void main(String[] args) {
		List<String> intList = Arrays.asList("abc","sxss","mno","jgj","brob");
	     // find the element start and end with same character
		intList.stream().filter(f->f.length()>0 && f.endsWith(String.valueOf(f.charAt(0)))).forEach(System.out::println);
	    
	}
}
