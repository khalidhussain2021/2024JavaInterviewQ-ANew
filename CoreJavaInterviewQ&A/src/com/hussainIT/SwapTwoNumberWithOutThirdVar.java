package com.hussainIT;

public class SwapTwoNumberWithOutThirdVar {

	public static void main(String[] args) {
		int x=12;
		int y=14;
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println(x +" "+y);

	}

}
