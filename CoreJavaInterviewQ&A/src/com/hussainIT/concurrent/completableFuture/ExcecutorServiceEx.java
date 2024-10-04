package com.hussainIT.concurrent.completableFuture;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExcecutorServiceEx {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService service=Executors.newFixedThreadPool(10);
		//
		Future<List<Integer>> future1 = service.submit(()-> {
			System.err.println("Thread "+Thread.currentThread().getName());
			delay(1);
			return Arrays.asList(1,3,4,5,6,9);
		});
		Future<List<String>> future2 = service.submit(()-> {
			System.err.println("Thread "+Thread.currentThread().getName());
			delay(1);
			return Arrays.asList("khalid","md","marathali","bang","hha");
		});
		Future<List<Character>> future3 = service.submit(()-> {
			System.err.println("Thread "+Thread.currentThread().getName());
			delay(1);
			return Arrays.asList('A','B','C','d','f');
		});
	
		
		List<Integer> list = future1.get();
		System.err.println(list);
		}
	
		public static void delay(int min) {
		try {
			TimeUnit.MINUTES.sleep(min);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
