package com.hussainIT.arrayList;

import java.util.HashSet;

public class HowManyPairMakewithTarget {

	public static void main(String[] args) {
		
		 int arr[] = {1, 2, 3, 4, 5};
	        int target = 5;
//	        int newArr[] = new int[arr.length];
//	        int k = 0;  // index for newArr
//
//	        for(int i = 0; i < arr.length; i++) {
//	            for(int j = i + 1; j < arr.length; j++) {
//	                if(arr[i] + arr[j] == target) {
//	                    newArr[k++] = arr[i];
//	                    newArr[k++] = arr[j];
//	                }
//	            }
//	        }
//
//	        // Print the new array with the pairs that sum to target
//	        System.out.println("Pairs that sum to " + target + ":");
//	        for(int i = 0; i < k; i++) {
//	            System.out.print(newArr[i] + " ");
//	        }
	        
	        HashSet<Integer> set = new HashSet<>();

	        System.out.println("Pairs that sum to " + target + ":");
	        for (int num : arr) {
	            int complement = target - num;
	            if (set.contains(complement)) {
	                System.out.println("(" + complement + ", " + num + ")");
	            }
	            set.add(num);
	        }
	        
	        
	    }
	}

