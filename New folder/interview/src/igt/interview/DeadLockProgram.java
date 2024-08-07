package igt.interview;

public class DeadLockProgram {
	public static void main(String[] args) {
		final Object res1 = new Object();
		final Object res2 = new Object();
		
		 Thread t1 = new Thread(()->{
			 
			 synchronized (res1) {
				System.out.println("thread 1: holding resource 1");
				try {Thread.sleep(100);}
				catch(InterruptedException ie) {
					ie.printStackTrace();
				}
				
				System.out.println("thread 1: waiting for resource 2");
			synchronized (res2) {
				System.out.println("thred 1 : holding resource 1 and resource 2");
				
			}
		}	 
			 
		 });
		 
		     Thread t2 = new Thread(()->{
		    	// To resolve deadlock, acquire resources in reverse order
		    	// synchronized(res1)
		    	 synchronized (res2) {
					
		    		 System.out.println("thread 2: holding resouce 2");
		    		 try {Thread.sleep(100);}
		    		 catch (InterruptedException ie) {
		    			 ie.printStackTrace();
					}
		    		 System.out.println("thread 2: waiting for resource 1");
			  // synchronized(res2)
		    	  synchronized (res1) {
				   System.out.println("Thread 2 : holding resource 2 and resouce 1");	
				}
		    	 }
		    	 
		     });
		     
		     t1.start();
		     t2.start();
		
		
	}

}
