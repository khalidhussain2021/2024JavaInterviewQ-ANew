package com.hussainIT.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo1 {
	public ArrayListDemo1() {
	System.out.println("hello ++++ ");
	}
	public static void main(String[] args) {
		ArrayList al5=new ArrayList<>();
		al5.add(12);
		al5.add("khalid");
		al5.add('A');
		al5.add(7878.909);
		al5.add(new Employee());
		al5.add(8l);
		al5.add(88.999d);
		boolean contains = al5.contains("khalid");
		al5.set(1,"kkkkkkkk");
		Collections.shuffle(al5);
		System.err.println(al5);
	}
}
