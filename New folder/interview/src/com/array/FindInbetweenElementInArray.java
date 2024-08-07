package com.array;

import java.util.Arrays;
import java.util.List;

public class FindInbetweenElementInArray {

	//[1,3,11,45,67,32,88]
		//freq 0 to 10 -->2
		// 10 to 20 -->1
	// 20 to 30-->0;
	public static void main(String[] args) {
		
List<Integer> numbers = Arrays.asList(1, 3, 11, 45, 67, 32, 88);
        
        // Define ranges
        int[][] ranges = {
            {0, 10},
            {10, 20},
            {20, 30},
            {30, 40},
            {40, 50},
            {50, 60},
            {60, 70},
            {70, 80},
            {80, 90}
        };

        // Calculate and print frequencies for each range
        for (int[] range : ranges) {
            long count = countNumbersInRange(numbers, range[0], range[1]);
            System.out.println("Frequency of numbers between " + range[0] + " and " + range[1] + ": " + count);
        }
		
	}
	private static long countNumbersInRange(List<Integer> numbers, int start, int end) {
        return numbers.stream()
                      .filter(n -> n >= start && n < end)
                      .count();
    }
}
