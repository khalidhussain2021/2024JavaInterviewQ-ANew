package com.hussainIT.java8.intefaceChanges;

public class TestDemoMain2 implements TestDemo{

	@Override
	public void dispaly() {
		System.err.println("display all skill ");
	}
    @Override
    public void show() {
    	System.err.println("This is override method of the default method ");
    }
    public static void main(String[] args) {
		TestDemoMain2 testDemoMain2 = new TestDemoMain2();
		testDemoMain2.show();
	}
}
