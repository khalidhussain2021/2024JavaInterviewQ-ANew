package com.hussainIT;

import java.util.ArrayList;
import java.util.List;

public class NumberOfStepsReduceingZero {
	public static void main(String[] args) {
		int numberOfStep = numberOfStep1(10);
		  System.err.println(numberOfStep);
	}
	public static int numberOfStep(int num) {
		int steps=0;
		while(num>0) {
			if(num%2==0) {
				num/=2;
			}else {
				num--;
			}
			steps++;
		}
		return steps;
	}
	
	public static int numberOfStep1(int num) {
		int steps=0;
		while(num>0) {
			if((num & 1)==0) {
				num>>=1;
			}else {
				num --;
			}
			steps++;
			}
		return steps;
		}
	
}
