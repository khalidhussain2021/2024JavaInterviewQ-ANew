package com.array.recall;

import java.util.Arrays;

public class RoatatingArray {
	public static void main(String[] args) {

		int[] a = {1, 2, 3, 4, 5, 6};
	    int[] rotate = rotate(a, 2, a.length);
	    System.out.println(Arrays.toString(rotate));
	}

	public static int[] rotate(int[] arr, int shift, int size) {
	    int[] output = new int[size];
	    for (int i = 0; i < output.length; i++) {
	        int newIndex = (arr.length - shift + i) % arr.length;// add + for left rotate
	        output[newIndex] = arr[i];
	        
	    }
	    return output;
	}

}
