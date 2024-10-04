package com.hussainIT;

public interface InterfDemo {
	
	public void msg();
	
	default public void rateOfInt() {
		int i=10;
		System.err.println(i);
	}
	public static void repoRate() {
		double d=12.0;
		System.err.println(d);
	}
	private void dbConnection() {
		System.err.println("db connection");
	}
	default void checkDb() {
		dbConnection();
	}
}
