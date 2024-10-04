package com.hussainIT.java8.intefaceChanges;

public interface TestDemo {
	
	public void dispaly();
	
	public static void print() {
		System.err.println("Print the price of the book ");
	}
	
	default public void show() {
		System.err.println("please show of the book ");
	}
}
