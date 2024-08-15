package com.hussainIT.concurrent.collection;

import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetEx {

	public static void main(String[] args) {
		CopyOnWriteArraySet st=new CopyOnWriteArraySet<>();
		st.add("D");
		st.add(null);
		st.add("B");
		st.add('A');
		st.add(10);
		st.add("D");
		st.add("A");
		st.add(90.9090);
		System.out.println(st);
	}

}
