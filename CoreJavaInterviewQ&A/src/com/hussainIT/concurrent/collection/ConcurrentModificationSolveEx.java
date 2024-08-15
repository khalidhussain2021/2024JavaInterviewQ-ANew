package com.hussainIT.concurrent.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentModificationSolveEx extends Thread {
   static ConcurrentHashMap<Integer, String> chm=new ConcurrentHashMap<>();
   @Override
	public void run() {
		try {
			Thread.sleep(2000);
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("chield thread update with :  ");
		chm.put(103,"C");
	}
   public static void main(String[] args) throws InterruptedException {
	chm.put(101,"A");
	chm.put(102, "B");
	ConcurrentModificationSolveEx th = new ConcurrentModificationSolveEx();
	th.start();
	Set set=chm.keySet();
	Iterator<Integer> iterator = set.iterator();
	while(iterator.hasNext()) {
		Integer i1 = iterator.next();
		System.out.println("Main thread iterating and current entry is "+i1 +"  "+chm.get(i1));
		Thread.sleep(3000);
	}
	System.err.println(chm);
    }
 }
