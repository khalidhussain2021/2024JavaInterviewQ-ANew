package com.hussainIT.interview.absent;

 interface Worker {
	 void doWork(int x);
 }

public class QuestionNo47 {
   public static void main(String[] args) {
	Worker work = x -> {
		for(int i=0;i<x;i++) {
			System.out.print(i +" ");
		}
	};
	work.doWork(5);
}
}
