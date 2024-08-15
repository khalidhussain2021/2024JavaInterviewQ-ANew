package com.hussainIT.set;

import java.util.HashSet;

import com.hussainIT.arrayList.Employee;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet hashSet =new HashSet<>();
		hashSet.add("Khalid");
		hashSet.add(90);
		hashSet.add('A');
		hashSet.add(null);
		hashSet.add(new Employee());
		HashSet<Integer> hashSet2 = new HashSet<Integer>();
		hashSet2.add(1);
		hashSet2.add(4);
		hashSet2.add(5);
		hashSet2.add(9);
		hashSet2.add(null);
		System.out.println(hashSet2);
		//union
		hashSet.addAll(hashSet2);
		System.out.println("unioun : "+hashSet);
		//intersection
		hashSet.retainAll(hashSet2);
		System.err.println(hashSet);
		//difference 
		hashSet.removeAll(hashSet2);
		System.err.println(hashSet);
		//subset
		hashSet.retainAll(hashSet2);
		System.err.println("subset of  "+hashSet);
	}
	

}
