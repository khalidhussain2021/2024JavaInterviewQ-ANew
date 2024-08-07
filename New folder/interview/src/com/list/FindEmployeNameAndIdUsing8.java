package com.list;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindEmployeNameAndIdUsing8 {

	public static void main(String[] args) {
		
		 List<Employee> asList = Arrays.asList(new Employee(1l, "dixit", 50d, 30),new Employee(3l, "satyam", 60d, 28));
	
		 Map<Long, String> collect = asList.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));
	    System.out.println(collect);
	}
}
