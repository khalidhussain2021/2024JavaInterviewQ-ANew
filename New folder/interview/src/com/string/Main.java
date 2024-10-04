package com.string;

public class Main {

	public static void main(String[] args) {
		
		
		Employee employee1 = new Employee(78l,"sonu",78900.0);
		employee1.setId(12l);
		employee1.setName("rohit");
		employee1.setSalry(10000.0);
		System.out.println(employee1.hashCode());
	
	Employee employee2 = new Employee(12l, "raj", 56000.0);
	Employee employee3=new Employee(78l,"sonu",78900.0);
//	employee2.setId(12l);
//	employee2.setName("rohit");
//	employee2.setSalry(56000.0);
	System.out.println(employee2.hashCode());		
	System.out.println(employee1.equals(employee2));
	System.out.println(employee1==employee3);
	System.err.println(employee1.equals(employee3));
	System.out.println(employee3);
	}
	
	
}
