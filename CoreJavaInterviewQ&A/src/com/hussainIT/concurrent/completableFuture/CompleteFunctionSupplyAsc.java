package com.hussainIT.concurrent.completableFuture;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;



public class CompleteFunctionSupplyAsc {
	public List<Employee> getEmployees() throws InterruptedException, ExecutionException {
		CompletableFuture<List<Employee>> supplyAsync = CompletableFuture.supplyAsync(()->{ 
		System.err.println("Thread "+Thread.currentThread().getName());
		return	DatabaseEx.fetchData();	
		});
		return supplyAsync.get();
	}
	public List<Employee> getEmployeeUsingSupplyAsyncExecutor() throws InterruptedException, ExecutionException {
		Executor executors=Executors.newCachedThreadPool();
		CompletableFuture<List<Employee>> supplyAsync2 = CompletableFuture.supplyAsync(()->{
			System.err.println("Thread "+Thread.currentThread().getName());
			return DatabaseEx.fetchData();
		}, executors);
		return supplyAsync2.get();	
	}
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompleteFunctionSupplyAsc asyncDemo = new CompleteFunctionSupplyAsc();
		List<Employee> employees = asyncDemo.getEmployees();
		employees.forEach(System.out::println);
		//custom executor call
		List<Employee> asyncExecutor = asyncDemo.getEmployeeUsingSupplyAsyncExecutor();
		asyncExecutor.forEach(System.out::println);
	}
}
