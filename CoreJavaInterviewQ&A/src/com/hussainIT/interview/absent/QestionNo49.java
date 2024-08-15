package com.hussainIT.interview.absent;

public class QestionNo49 {
 public static void main(String[] args) {
	int array[]= {3,7,9,8,3,9,0,2};
	int returnIntedxArray = returnIntedxArray(array);
	System.out.println(returnIntedxArray);
	
}
 public static int returnIntedxArray(int array[]) {
	 if(array.length >4) {
		 return array[4];
	 }else {
		 throw new ArrayIndexOutOfBoundsException("Empty array");
	 }
 }
}
