package com.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {
	
	public static void main(String[] args) {
	  
		   List<Contact> contacts = Arrays.asList(
				  new Contact(12l),
				  new Contact(14l),
				  new Contact(16l)
				  );
		
		List<Employee> empList = Arrays.asList(
				new Employee(1l,"rksh",33d,33,contacts),
				new Employee(2l, "nanu", 56d, 45, contacts)
				);
		
		String ser="rksh";
		// empList.stream().flatMap(e->e.getName(),m->m.getListContact()).collect(Collectors.toList());
		List<Contact> collect = empList.stream().flatMap(e->e.getListContact().stream().filter(c->empList.get(0).getName().equals(ser))).collect(Collectors.toList());
		System.out.println(collect);
	}
	

}
