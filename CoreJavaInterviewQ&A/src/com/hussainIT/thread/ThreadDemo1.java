package com.hussainIT.thread;


class MyThreadDemo implements Runnable {
	int number;
	public MyThreadDemo(int number) {
		this.number=number;
	}
	@Override
	public void run() {
		if(number % 2==0) {
			System.err.println("even No "+number);
		}else {
			System.out.println("odd No "+number);
		}
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
		
		for(int i=1;i<20;i++) {
			MyThreadDemo myThreadDemo = new MyThreadDemo(i);
			Thread thread = new Thread(myThreadDemo);
			thread.start();
			
		}
	}
}
