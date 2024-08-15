package com.hussainIT.java8.methodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface Printable {
	void print(String msg);
}

public class MethodReferenceDemo {
	
	public void dispaly(String msg) {
		msg=msg.toUpperCase();
		System.out.println(msg);
	}
	
	//static method
	public static int addition(int a,int b) {
		return (a+b);
	}
	public static void main(String[] args) {
		
		//functioanl interface 
		Function<Integer,Double> function=(input)->Math.sqrt(input);
		System.out.println(function.apply(16));
		//Method Reference static
		Function<Integer,Double> methodRef=Math::sqrt;
		System.err.println(methodRef.apply(100));
		
		BiFunction<Integer,Integer,Integer> bifunction=(a,b)->MethodReferenceDemo.addition(a, b);
		System.out.println(bifunction.apply(20, 30));
		
		//method Referance 
		BiFunction<Integer, Integer, Integer> bifuncMethodRef=MethodReferenceDemo::addition;
		System.err.println(bifuncMethodRef.apply(10, 14));
		
		// 2. Method reference to instance method of the particualr object
		//way to find the lambda 
		MethodReferenceDemo obj=new MethodReferenceDemo();
		Printable printable=(msg)->obj.dispaly(msg);
		printable.print("Hello world");
		
		//way to find the method reference
		Printable methodRef1=obj::dispaly;
		methodRef1.print("khalid hussain");
		
		// 3 . Reference to the instance method of the arbitary object 
		Function<String, String>  stringFunc=(String input)->input.toLowerCase();
		System.out.println(stringFunc.apply("BANGloru"));
		
		Function<String, String> StringMethodFun=String::toLowerCase;
		System.out.println(StringMethodFun.apply("PatNa"));
		
		String arrArry[]= {"C","D","A","W","F","H","Z","B"};
		
		Arrays.sort(arrArry,(s1,s2)->s1.compareToIgnoreCase(s2));
		System.out.println(Arrays.toString(arrArry));
		
		Arrays.sort(arrArry,(String::compareToIgnoreCase));
		
		//4 . reference into the constructor
		List<String> fruits=new ArrayList<>();
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("watermelon");
		Function<List<String>, Set<String>> setFunction=(fruitList)->new HashSet<>(fruitList);
		
	}
}
