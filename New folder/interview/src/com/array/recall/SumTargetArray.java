package com.array.recall;

import java.util.HashMap;
import java.util.Map;

public class SumTargetArray {
	public static void main(String[] args) {
		int[] input = {1, 6, 3, 2, 5, 5, 7, 8, 4, 8, 2, 5, 9, 9, 1};
		int target = 10;
		
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < input.length; i++) {
		    map.put(input[i], i);
		}

		for (int num : input) {
		    if (map.containsKey((target - num))) {
		        System.out.println(num + "," + (target - num));
		    }
		}
	
	
	}

}
