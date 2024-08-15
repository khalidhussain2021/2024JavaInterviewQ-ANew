package com.hussainIT.concurrent.collection;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEx {
    public static void main(String[] args) {
    	
    	ArrayList al=new ArrayList<>();
    	al.add("A");
    	al.add("B");
    	
		CopyOnWriteArrayList  cowa = new CopyOnWriteArrayList<>();
		cowa.addIfAbsent("A");
		cowa.addIfAbsent("C");
		cowa.addAll(al);
		
		ArrayList al1=new ArrayList<>();
		al1.add("A");
		al1.add("E");
		cowa.addAllAbsent(al1);
		System.out.println(cowa);
		
	}
}

