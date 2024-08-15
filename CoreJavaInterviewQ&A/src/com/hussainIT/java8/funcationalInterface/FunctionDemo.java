package com.hussainIT.java8.funcationalInterface;

import java.util.function.Function;

//class FunctionExam implements Function<String, String> {
//
//	@Override
//	public String apply(String t) {
//		System.out.println("Hi "+t);
//		return t;
//	}
//}
public class FunctionDemo {
	public static void main(String[] args) {
//		Function<String,Integer> f=(s)->s.length();
//		Integer result = f.apply("khalid hussain");
		Function<String, String> fu=(s)-> {
			String s1=" Hi" + s +" am java ";
			System.out.println(s1);
			return s1;
		};
		fu.apply("khalid");
//		System.out.println(result);
	}
}

