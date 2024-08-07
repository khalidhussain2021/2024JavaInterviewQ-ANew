package com.array;

import java.util.Arrays;

public class PrintSquareAndFindLessThan100 {
	//req. first square given number print no which is less than 100
	public static void main(String[] args) {
		
		Integer [] input= {1,2,3,4,5,6,7,8,9,10,20,30,40};
		
		Arrays.asList(input).stream().map(s->s*s).filter(f->f<100).forEach(System.out::println);
		
	}

}
