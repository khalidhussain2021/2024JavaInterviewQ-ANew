package com.hussainIT.concurrent.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentModificationExDemo  extends Thread{
	static ArrayList<String> al=new ArrayList<>();
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		}catch (Exception e) {
		   e.printStackTrace();
		}
		System.out.println("child thread updated list : " );
		al.add("D");
	}
	public static void main(String[] args) throws InterruptedException {
		al.add("A");
		al.add("B");
		al.add("C");
		ConcurrentModificationExDemo thDemo=new ConcurrentModificationExDemo();
		thDemo.start();
		Iterator<String> iterator = al.iterator();
		while(iterator.hasNext()) {
			String items = iterator.next();
			System.out.println(" Main thread iterator and current thread objec "+ items);
			Thread.sleep(3000);
		}
		System.err.println(al);
	}

}
