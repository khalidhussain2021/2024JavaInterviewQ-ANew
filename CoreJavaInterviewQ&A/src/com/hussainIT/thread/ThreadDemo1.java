package com.hussainIT.thread;


class MyRunableThread implements Runnable {
   static int number1;
	@Override
	public void run() {
		if(number1 %2==0) 
			System.out.println("Hi ");
		else
			System.out.println("Bye");
	}
	
}
public class ThreadDemo1 extends Thread { 
	static int number;
	public ThreadDemo1(int number) {
		this.number=number;
	}
	@Override
	public void run() {
		
			if(number%2==0) {
				System.err.println("even ");
			}else {
				System.out.println("odd no ");
			}
			System.out.println(Thread.currentThread().isDaemon());
	}
	
	public static void main(String[] args) {
		for(int i=1;i<20;i++) {
			ThreadDemo1 threadDemo1 = new ThreadDemo1(i);
			threadDemo1.setDaemon(true);
			threadDemo1.start();
		
		}
		
		MyRunableThread myRunableThread = new MyRunableThread();
		new Thread(myRunableThread).start();
	}
}
