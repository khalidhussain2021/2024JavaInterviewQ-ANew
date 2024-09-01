package com.array.recall;

import java.util.Arrays;
import java.util.stream.IntStream;

//merge the element of the third array in in the java
public class MergeTwoArray {
	public static void main(String[] args) {
		int[] a= {1,2,3};
		int[] b= {4,5,6};
		
		int [] c = new int[a.length + b.length];
		
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		
		for(int i=0;i<b.length;i++) {
			c[a.length + i]=b[i];
		}
		System.out.println(Arrays.toString(c));
		
		// Concatenate two arrays using Java 8 Streams
        int[] c1 = IntStream.concat(Arrays.stream(a), Arrays.stream(b))
                           .toArray();
        // Print the resulting array
        System.out.println(Arrays.toString(c1));
	}

}
