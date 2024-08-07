package com.hussainIT;

public class CheckOddEvenUsingThread extends Thread {
	
	 private int number;
	 
	 public CheckOddEvenUsingThread(int number) {
		this.number=number;
	}
    @Override
    public void run() {
    	if(number % 2==0) {
    		System.out.println(" thread number is even "+number);
    	}else {
    		System.err.println("thread 2 number is odd"+number);
    	}
    }
	 
	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
			CheckOddEvenUsingThread th=new CheckOddEvenUsingThread(i);
            th.start();
        }

	}
	

}
