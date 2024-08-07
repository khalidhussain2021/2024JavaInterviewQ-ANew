package com.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondLargestUsingJava8 {
	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(new Employee(1l, "rksh", 50000d, 25),
				new Employee(1l, "babu", 80000d, 33),
				new Employee(1l, "satm", 60000d, 30),
				new Employee(1l, "mit", 70000d, 29));
		
		//comparing first name then salary
	List<Employee> collect1 = empList.stream().sorted(Comparator.comparing(Employee::getName)
		.thenComparingDouble(Employee::getSalary)).collect(Collectors.toList());
//	System.out.println(collect1);
	
		//find 2nd largest salary
		 List<Employee> collect2 = empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
				 .collect(Collectors.toList());
//	    System.out.println(collect2.get(1));
	    
	    //find salary greater than 60k and sorted by ascending and descending
	    List<Employee> collect3 = empList.stream().filter(empSal->empSal.getSalary()>60000)
	    		.sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList());
//	    System.out.println(collect3);
	    
	    //find the age greater than 30 if greater 30 display Older else Younger
	      boolean flag=false;
	   List<Employee> emp= empList.stream().filter(empAge->{
		   if(empAge.getAge()>30) {
		   
	   System.out.println("Older "+empAge);
		   
	   }else{
	    		System.out.println("Younger "+ empAge);
	    	} 
		   return flag;
	    }).collect(Collectors.toList());
	    System.out.println(emp);
	    
	}

}
