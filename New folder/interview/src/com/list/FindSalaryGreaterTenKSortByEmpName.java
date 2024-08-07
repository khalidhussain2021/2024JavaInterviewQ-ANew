package com.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.string.Employee;

public class FindSalaryGreaterTenKSortByEmpName {
  public static void main(String[] args) {
	  List<Employee> asList = Arrays.asList(new Employee(1l, "satyam", 50000d),new Employee(8l, "atyam", 80000d),new Employee(5l, "tyam", 60000d),new Employee(2l, "yam", 700000d));
	  
   List<Employee> sorted = asList.stream().filter(sal->sal.getSalry()>50000).sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList());
   System.out.println(sorted); 
  }
}
