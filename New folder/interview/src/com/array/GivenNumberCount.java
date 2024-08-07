package com.array;

import java.util.Arrays;

public class GivenNumberCount {
	public static void main(String[] args) {
		int [] num= {1,2,3,4,5,6,7,8,90};
		int count=0;
		for(int i=0;i<num.length;i++) {
			count++;
		}
		System.out.println(count);
		//using java 8
		System.out.println(Arrays.stream(num).count());
	}

}
