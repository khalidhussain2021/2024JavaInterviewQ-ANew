package com.hussainIT.java8.funcationalInterface;
class ThreadDemo implements Runnable {
	int number;
	public ThreadDemo(int number) {
		this.number=number;
	}
	@Override
	public void run() {
		if(number %2 !=0) {
			System.out.println("odd No");
		}else {
			System.out.println("even no");
		}
	}
}

public class RunnableLambdaEx {
	public static void main(String[] args) {
		
		for(int i=0;i<10;i++) {
		Thread  th =new Thread(new ThreadDemo(i));
		th.start();
		}
		//using java 8
		int number = 0;
		int i=number;
		Runnable runnable=() -> {
			if(number %5 !=0) {
				System.out.println("odd No +" +number);
			}else {
				System.out.println("even no");
			}

		};
		for( i=1;i<5;i++) {
		Thread t=new Thread(runnable);
		t.start();
		}
	}
}
