package com.array;

import java.util.Arrays;
import java.util.Comparator;

public class ReverseArray {
	
	public static void main(String[] args) {
		
		int[] input= {1,2,3,4,5,6,7};
		int len = input.length;
		
		
		for(int i=0;i<len/2;i++) {
			int temp = input[i];
            input[i] = input[len - 1 - i];
            input[len - 1 - i] = temp;
			
		}
		System.out.println(Arrays.toString(input));
		
		//java 8 
		Arrays.stream(input).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
