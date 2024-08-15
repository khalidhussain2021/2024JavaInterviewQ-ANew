package com.hussainIT.concurrent.collection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayThreadEx extends Thread {
	
	static CopyOnWriteArrayList<String> al=new CopyOnWriteArrayList<>();
	
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("chield thread updateing ");
		al.add("C");
	}
	public static void main(String[] args) throws InterruptedException {
		al.add("A");
		al.add("B");
		CopyOnWriteArrayThreadEx threadEx = new CopyOnWriteArrayThreadEx();
		threadEx.start();
		Iterator<String> iterator = al.iterator();
		while(iterator.hasNext()) {
			String item = iterator.next();
			System.out.println("Main Thread iterator Updaing List "+item);
			Thread.sleep(3000);
		}
		System.out.println(al);
	}
}
