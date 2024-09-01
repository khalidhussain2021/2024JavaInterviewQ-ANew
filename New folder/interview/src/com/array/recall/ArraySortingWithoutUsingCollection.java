package com.array.recall;

public class ArraySortingWithoutUsingCollection {
	
	public static void main(String[] args) {
		
		//Sorting the array elemrnt that is present in the index position  without using collection
		Integer[] arr= {1,1,2,2,2,3,3,4,5};

		 int len=arr.length;
		 int temp[] = new int[arr.length];
		 int j=0;
		 
		 for(int i=0;i<len-1;i++) {
			 if(arr[i] != arr[i+1]) {
				temp[j++]=arr[i]; 
			 }
		 }
		 temp[j++]=arr[len-1];
		 for(int k=0;k<j;k++)	{
			 System.out.println(temp[k]);
		 }
		 
		 // array with 2nd and 3rd large
		 System.out.println("--------->"+arr[len-2]);
		 
		 //using the bubble sort we can sorted the value that is present any index position 
		// Sorting the array elements without using collections
	        Integer[] arr1 = {1, 4, 5, 4, 4, 2, 4, 9};
	        int len1=arr1.length;
	        for(int i=0;i<len1-1;i++) {
	        	for(int j1=0;j1<len1-i-1;j1++) {
	        		if(arr1[j1] > arr1[j1+1]) {
	        			int temp1=arr1[j1];
	        			arr1[j1]=arr1[j1+1];
	        			arr1[j1+1]=temp1;
	        		}
	        	}
	        }
		   for(int i=0;i<len-1;i++) {
			   System.err.println(arr1[i]);
		   }
		 }

}
