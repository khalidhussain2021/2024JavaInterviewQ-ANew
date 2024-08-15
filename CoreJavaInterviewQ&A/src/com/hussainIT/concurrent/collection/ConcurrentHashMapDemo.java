package com.hussainIT.concurrent.collection;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();
		concurrentHashMap.put(101,"A");
		concurrentHashMap.put(102,"B");
		concurrentHashMap.putIfAbsent(103,"C");
		concurrentHashMap.putIfAbsent(101,"D");
		concurrentHashMap.remove(101,"D");
		concurrentHashMap.replace(102,"B", "E");
		System.out.println(concurrentHashMap);
	}

}
