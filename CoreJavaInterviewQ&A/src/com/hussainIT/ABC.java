package com.hussainIT;

public class ABC {
	public static void main(String[] args) {
		try {
			throw new Exception();
		}catch(Exception e) {
			try {
				int i=0/5;
				throw new ArithmeticException();
			}catch (ArithmeticException e1) {
				System.out.println("Exception");
			}
			System.out.println("cought");
		}
		
	}

}
