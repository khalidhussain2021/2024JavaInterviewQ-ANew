package com.hussainIT.java8.intefaceChanges;

public class TestDemoMain3 implements TestDemo{

	@Override
	public void dispaly() {
		System.out.println("Hello develop my skill in java ");
	}
	@Override
	public void show() {
		TestDemo.super.show();
	}
}
