package com.hussainIT;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GenerateRandomSubstringofLength6 {
	public static void main(String[] args) {
		String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		Random random=new Random();
				//Please generate the random substring of length 6 from the above String using java 8 stream
	String result = IntStream.range(0, 6)
	.map(i->random.nextInt(str.length()))
	.mapToObj(str::charAt)
	.map(String::valueOf)
	.collect(Collectors.joining());

    System.out.println(result);
		
	}
}
