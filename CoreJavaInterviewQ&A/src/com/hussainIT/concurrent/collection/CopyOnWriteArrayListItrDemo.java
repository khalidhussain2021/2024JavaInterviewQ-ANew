package com.hussainIT.concurrent.collection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListItrDemo {
	public static void main(String[] args) {
		
		CopyOnWriteArrayList<String> cowal=new CopyOnWriteArrayList<>();
//		ArrayList<String> cowal=new ArrayList<>();
		cowal.add("A");
		cowal.add("B");
		cowal.add("C");
		Iterator<String> iterator = cowal.iterator();
		cowal.add("D");
		while(iterator.hasNext()) {
			String s1 = iterator.next();
			System.out.println(s1);
		}
		System.out.println(cowal);
	}
}
