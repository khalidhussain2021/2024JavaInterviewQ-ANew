package com.hussainIT.concurrent.collection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRemoveMethodEx {

	public static void main(String[] args) {
		
		CopyOnWriteArrayList<String> al = new CopyOnWriteArrayList<>();
//		ArrayList<String> al=new ArrayList<>();
		
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		System.out.println(al);
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			String item1 = itr.next();
			if(item1.equals("C")) {
				itr.remove();
			}
		}

	}

}
