package com.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindOddNunberAddOne {
	
	public static void main(String[] args) {
		 
		Integer[] input= {1,2,3,4,5,6,7,8,9};
		
		List<Integer> collect = Arrays.asList(input).stream().filter(e->e%2==0).map(a->a+1).collect(Collectors.toList());
		 Arrays.asList(input).stream().filter(e->e%2!=0).forEach(System.out::println);
		
		System.out.println(collect +" ");
		
		boolean flag =false;
		//odd, even
		List<Integer> collect1 = Arrays.asList(input).stream().filter(e->{
			if(e%2==0) {
				System.out.println("odd "+e);
			}else {
				System.out.println("even "+e);
			}
				
		return flag;
		}
		).map(a->a+1).collect(Collectors.toList());
		System.out.println(collect1);
	}

}
