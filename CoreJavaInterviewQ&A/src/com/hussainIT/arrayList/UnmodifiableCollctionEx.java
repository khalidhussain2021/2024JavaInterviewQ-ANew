package com.hussainIT.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableCollctionEx {
	public static void main(String[] args) {
		List<String> fr=new ArrayList<>();
		fr.add("graphs");
		fr.add("waterMelon");
		fr = Collections.unmodifiableList(fr);
		fr.add("cucumber");
		System.out.println(fr);
	}

}
