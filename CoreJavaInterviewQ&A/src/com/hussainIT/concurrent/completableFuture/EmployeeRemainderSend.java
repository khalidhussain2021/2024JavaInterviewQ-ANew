package com.hussainIT.concurrent.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class EmployeeRemainderSend {
	
	//using supplyAsync() method
	public CompletableFuture<Void> sendReminderToEmployee() {
		CompletableFuture<Void> thenAccept = CompletableFuture.supplyAsync(()-> {
		System.out.println("fetch the all employees "+Thread.currentThread().getName());
		return DatabaseEx.fetchData();
		}).thenApply((employees)->{
		System.err.println("filter the all employee whose the salary greather then 50000 "+Thread.currentThread().getName());
		return	employees.stream().
			filter(emp->emp.getEmployeeSalary()>50000).collect(Collectors.toList());
		}).thenApply((employees)->{
		System.out.println("HR depart whose employee having "+Thread.currentThread().getName());
		return employees.stream().filter(e->e.getEmployeeDepartment().equals("HR")).
			collect(Collectors.toList());
		}).thenApply((employee)->{
			System.err.println("fetch emails employee whose in HR department "+Thread.currentThread().getName());
		 return	employee.stream().map(Employee::getEmployeeEmail).collect(Collectors.toList());
		}).thenAccept((emails)->{
			System.out.println("sent the email to employees "+Thread.currentThread().getName());
			emails.forEach(EmployeeRemainderSend::sendEmail);
		});
		return thenAccept;
	}
	public static void sendEmail(String email) {
		System.err.println("Send the email employee name "+email);
	}
	
	//using supplyAsync & thenApplyAsync() method 
	//custom executor
	public CompletableFuture<Void> sendToRemainderEmailToEmpExe() {
		Executor executor=Executors.newFixedThreadPool(5);
		CompletableFuture<Void> thenAcceptAsyncExe = CompletableFuture.supplyAsync(()->{
			System.out.println("all Employees "+Thread.currentThread().getName());
			System.err.println("proirity" +Thread.currentThread().getPriority());
			return DatabaseEx.fetchData();
		},executor).thenApplyAsync((employees)->{
			System.err.println("get the employee whose Department IT"+Thread.currentThread().getName());
			System.out.println("priority "+Thread.currentThread().getPriority());
			return employees.stream().filter(e->e.getEmployeeDepartment().equalsIgnoreCase("Finance")).collect(Collectors.toList());
		},executor).thenApplyAsync((employees)->{
			System.err.println("get the name whose start with the j"+Thread.currentThread().getName());
			System.out.println("priority "+Thread.currentThread().getPriority());
			return employees.stream().
					filter(e->e.getEmployeeName().startsWith("J") || 
							e.getEmployeeName().startsWith("L")
							&& e.getEmployeeName().length()>3)
					.collect(Collectors.toList());
		},executor).thenApplyAsync((employees)->{
			System.err.println("get email "+Thread.currentThread().getName());
			System.out.println("priority"+Thread.currentThread().getPriority());
			return employees.stream().map(Employee::getEmployeeEmail).collect(Collectors.toList());
		},executor).thenAcceptAsync((emails)->{
			System.out.println("sent the email "+Thread.currentThread().getName());
			System.err.println("priority "+Thread.currentThread().getPriority());
			emails.forEach(EmployeeRemainderSend::sendEmail);
		},executor);
		return thenAcceptAsyncExe;
	}

	//using supplyAsync & thenApplyAsync() method 
	public CompletableFuture<Void> sendToRemainderEmailToEmp() {
		CompletableFuture<Void> thenAcceptAsync = CompletableFuture.supplyAsync(()->{
			System.out.println("all Employees "+Thread.currentThread().getId());
			System.err.println("proirity" +Thread.currentThread().getPriority());
			return DatabaseEx.fetchData();
		}).thenApplyAsync((employees)->{
			System.err.println("get the employee whose Department IT"+Thread.currentThread().getId());
			System.out.println("priority "+Thread.currentThread().getPriority());
			return employees.stream().filter(e->e.getEmployeeDepartment().equalsIgnoreCase("IT")).collect(Collectors.toList());
		}).thenApplyAsync((employees)->{
			System.err.println("get the name whose start with the j"+Thread.currentThread().getId());
			System.out.println("priority "+Thread.currentThread().getPriority());
			return employees.stream().
					filter(e->e.getEmployeeName().startsWith("J") || 
							e.getEmployeeName().startsWith("L")
							&& e.getEmployeeName().length()>3)
					.collect(Collectors.toList());
		}).thenApplyAsync((employees)->{
			System.err.println("get email "+Thread.currentThread().getId());
			System.out.println("priority"+Thread.currentThread().getPriority());
			return employees.stream().map(Employee::getEmployeeEmail).collect(Collectors.toList());
		}).thenAcceptAsync((emails)->{
			System.out.println("sent the email "+Thread.currentThread().getName());
			System.err.println("priority "+Thread.currentThread().getPriority());
			emails.forEach(EmployeeRemainderSend::sendEmail);
		});
		return thenAcceptAsync;
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		EmployeeRemainderSend remainderSend = new EmployeeRemainderSend();
//		remainderSend.sendReminderToEmployee().get();
//		remainderSend.sendToRemainderEmailToEmp().get();
		remainderSend.sendToRemainderEmailToEmpExe().get();
	}
}
