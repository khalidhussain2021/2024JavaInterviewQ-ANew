package com.hussainIT.concurrent.completableFuture;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class CompletableFuturerunAsyncDemo {
	
	public Void saveEmployee(File jsonFile) throws InterruptedException, ExecutionException {
		ObjectMapper mapper=new ObjectMapper();
		
		  CompletableFuture<Void> runAsync = CompletableFuture.runAsync(new Runnable() {
			@Override
			public void run() {
				try {
					List<Employee> employees=mapper.
							readValue(jsonFile,new TypeReference<List<Employee>>(){
							});
					System.err.println("Thread "+Thread.currentThread().getName());
					System.out.println(employees.size());
					employees.forEach(System.out::println);
				}catch (Exception e) {
					e.printStackTrace();
				}
			}

		});
	return 	runAsync.get();  
	}
	
	public Void saveEmployeeCustomExcutor(File jsonFile) throws InterruptedException, ExecutionException {
		ObjectMapper mapper=new ObjectMapper();
		ExecutorService executors=Executors.newFixedThreadPool(10);
		CompletableFuture<Void> runAsyncwithLamda = CompletableFuture.runAsync(()->{
		try {
			List<Employee> empList = mapper.readValue(jsonFile,new TypeReference<List<Employee>>() {
			});
			//write a logic for save the data in the database
			System.out.println("Thread "+Thread.currentThread().getName());
			System.out.println("thread "+Thread.currentThread().getId());
			System.err.println(empList.size());
			empList.forEach(System.out::println);
		} catch (StreamReadException e) {
			e.printStackTrace();
		} catch (DatabindException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		}, executors);
		
		return runAsyncwithLamda.get();	
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuturerunAsyncDemo obj = new CompletableFuturerunAsyncDemo();
		obj.saveEmployee(new File("employees.json"));
		obj.saveEmployeeCustomExcutor(new File("employees.json"));
	}
}
