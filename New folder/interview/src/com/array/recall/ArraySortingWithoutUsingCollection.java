package com.array.recall;

public class ArraySortingWithoutUsingCollection {
	
	public static void main(String[] args) {
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
		 }

}
