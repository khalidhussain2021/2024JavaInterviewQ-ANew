package com.hussainIT.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.hussainIT.arrayList.Employee;

public class SortedListDemo {
	public static void main(String[] args) {
		List<String> listOfvehical=Arrays.asList("car","jeep","maruti","train","bus","vekta","sumo");
		
		List<String> sorteList = listOfvehical.stream().sorted().collect(Collectors.toList());
		List<String> sortedList2 = listOfvehical.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		listOfvehical.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		List<String> sortedList3 = listOfvehical.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(sortedList3);
		
		//Employee 
		List<Employee> employees=new ArrayList<>();
		employees.add(new Employee(1,"khalid", 23,34900));
		employees.add(new Employee(3,"ram",21,4000));
		employees.add(new Employee(8,"anish", 89, 100000));
		List<Employee> sortedEmpSalary = employees.stream().sorted(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o1.geteSalary()-o2.geteSalary());
			}
		}).collect(Collectors.toList());
		List<Employee> sortedEmpSalary2 = employees.stream().sorted((o1,o2)->(int) o2.geteSalary()- (int)o1.geteSalary()).collect(Collectors.toList());
		List<Employee> sortedEmpSalary3 = employees.stream().sorted(Comparator.comparingLong(Employee::geteSalary)).collect(Collectors.toList());
		List<Employee> sortedSalary4 = employees.stream().sorted(Comparator.comparing(Employee::geteName).reversed()).collect(Collectors.toList());
		
		System.out.println(sortedSalary4);
//		int sum = listOfvehical.stream()
//				                     .filter(w -> w.getColor() == RED)
//				                      .mapToInt(w -> w.getWeight())
//				                    .sum();
		
//		 List<Integer> integers = numbers.<Integer>mapMulti((number, consumer) -> {
//		     *             if (number instanceof Integer i)
//		     *                 consumer.accept(i);
//		     *         })
//		     *         .collect(Collectors.toList());
	}
}
