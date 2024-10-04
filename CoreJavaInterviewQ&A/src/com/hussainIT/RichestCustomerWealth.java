package com.hussainIT;
public class RichestCustomerWealth {
	public static void main(String[] args) {
		int[][] accounts= {
				{1,4,5,7},
				{9,2,5,3},
				{1,0,12,9} };
		int maxCutomerWealthFor = maxCutomerWealthFor(accounts);
		System.err.println(maxCutomerWealthFor);
	}
	public static int maxCutomerWealthFor(int [][] accounts) {
		int maxWeath=0;
		for(int [] customer:accounts) {
			int currentCustomerWeath=0;
			for(int bank:customer) {
				currentCustomerWeath+=bank;
			}
			maxWeath=Math.max(currentCustomerWeath, maxWeath);
		}
		return maxWeath;
	}
	
}
