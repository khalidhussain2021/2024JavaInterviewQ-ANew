package com.array;

import java.util.Arrays;

public class SplitArrayByThree {
 public static void main(String[] args) {
	 int [] original= {1,2,3,4,5,6,7,8};

	 int chunk = 3; // chunk size to divide
	 for(int i=0;i<original.length;i+=chunk){
	     System.out.println(Arrays.toString(Arrays.copyOfRange(original, i, Math.min(original.length,i+chunk))));
	 }    }
	}


