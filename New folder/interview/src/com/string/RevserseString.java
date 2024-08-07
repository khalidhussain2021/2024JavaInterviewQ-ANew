package com.string;

import java.util.stream.Stream;
//map to transofrom our data we will use map
//fillter to filter our data we will use fillter

public class RevserseString {
	public static void main(String[] args) {
		String name="satyam";
		String var="";
		for(int i=name.length()-1;i>=0;i--) {
			 var+=name.charAt(i);
		}
//		System.out.println(var);
		//using java 8
		Stream.of(name).map(names->new StringBuffer(names).reverse())
		.forEach(System.out::print);
		
	}
}
