package com.array.recall;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class BasedUponNumberCount {
	public static void main(String[] args) {
		int[] input = { 20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20 };

		Map<Integer, Long> collect = Arrays.stream(input).filter(f -> f % 2 == 0).boxed()
				.collect(Collectors.groupingBy(n -> n, Collectors.counting()));
		System.out.println(collect);

		// without java 8
		Map<Integer, Long> hashmap = new HashMap<>();
		for (int i = 0; i < input.length; i++) {
			int number = input[i];
			if (number % 2 == 0) {
				if (hashmap.containsKey(number)) {
					hashmap.put(number, hashmap.get(number) + 1);
				} else {
					hashmap.put(number, 1l);
				}
			}
		}
		System.err.println(hashmap);

	}
}
