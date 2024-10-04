package com.hussainIT;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GenerateRandomStringwithLength6 {
	public static void main(String[] args) {
		String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		Random random=new Random();
		int length=6;
		String result = IntStream.range(0, 6).
		mapToObj(i->String.valueOf(str.charAt(random.nextInt(length))))
		.collect(Collectors.joining());
		System.err.println(result);
	}
}
