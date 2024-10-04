package com.hussainIT.java8.intefaceChanges;

public class TestDemoMain1 implements TestDemo{

	@Override
	public void dispaly() {
		System.err.println("display the skill in front of company");
	}
		
	public static void main(String[] args) {
		TestDemoMain1 testDemoMain1 = new TestDemoMain1();
		testDemoMain1.show();
		testDemoMain1.dispaly();
	}
}
