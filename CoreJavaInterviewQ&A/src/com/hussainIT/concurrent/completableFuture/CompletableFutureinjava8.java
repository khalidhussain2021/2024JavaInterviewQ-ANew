package com.hussainIT.concurrent.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/*what is CompletableFuture in java 8
 * CompletableFuture : A new era of the asynchronous programming.
 * using Asynchrouns programming we can write non-blocking code where we can run N number of the
 * task in seperate thread without blocking main thread .when the task is complete it notifies to 
 * the main thread where task is complete or fail.
 * 
 * Why is CompleteableFuture :
 *   There are different way to implement asynchrous programming in java .using any of the mechnism 
 *   for example , Futures, ExecutorService, CallBack interface and Thread Pool etc.
 *   1.It cannot be manully complete.
 *   2.multiple future cannot be chainned together.
 *   3 .we can not combine multiple future together .
 *   4 No proper exception handling mechnesim.
 *   
 *   CompletableFuture.runAsync() & CompletableFuture.supplyAsync();
 *   CompletableFuture.runAsync() -- > if we want to run some background task asynchronously and 
 *   do not want return any from that task then use CompletableFuture.runAsync() it takes a runnable 
 *   object and return CompletableFuture<void>
 *   1.CompletableFuture.runAsync(Runnable un)
 *   2. CompletableFuture.runAsync(Runnable,Executor)
 *   
 *   CompletableFuture.supplyAsync();
 *   if we want to run some background task asynchronously and want to return any things that task
 *   we should use CompletableFuture.supplyAsync() method. it takes a Supplier<T> and return T where
 *   CompletableFuture type of the value obtained by calling the given method.
 *   CompletableFuture.supplyAsync(Supplier<T>)
 *   CompletableFuture.supplyAsync(Supplier<T>,Executor);
 *   
 *    
 * 
 * */
public class CompletableFutureinjava8 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<String> completableFuture = new CompletableFuture<>();
		completableFuture.get();
		completableFuture.complete("return some of the dummy value");
		
	}
}
