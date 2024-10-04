package fulcrum.interview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeTest {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", 50000, "IT"));
        employees.add(new Employee(2, "Alice", 60000, "IT"));
        employees.add(new Employee(3, "Bob", 70000, "HR"));
        employees.add(new Employee(4, "Emily", 55000, "HR"));
        
        //Get the Average salary for each department - should return Map<String, Double>
        Map<String, Double> res = employees.stream().collect(Collectors.groupingBy(Employee::getEmp_dept,Collectors.averagingDouble(Employee::getEmp_salary)));
	
        System.out.println(res);
        
	    //Get the max salary per department - should return Map<String, Long>
        
	      Map<String, Long> collect = employees.stream()
          .collect(Collectors.groupingBy(Employee::getEmp_dept,
                  Collectors.mapping(Employee::getEmp_salary,
                          Collectors.collectingAndThen(Collectors.maxBy(Double::compare),
                                  maxOpt -> maxOpt.map(Double::longValue).orElse(0L)))));
	     System.out.println(collect);
	     //Get the Employee information for each department - should return Map<String, List<Employee>>
	      
	     Map<String, List<Employee>> collect3 = employees.stream()
         .collect(Collectors.groupingBy(Employee::getEmp_dept));
//	     System.out.println(collect3);
	     
	     //Sort the Employees by Salary - should return List<Employee>
	     List<Employee> emp=employees.stream().sorted(Comparator.comparing(Employee::getEmp_salary)).collect(Collectors.toList());
//	     System.out.println(emp);
	     
	   // demo
	     
//	     employees.stream().collect(Collectors.groupingBy(Employee::getEmp_dept,Collectors.collectingAndThen(Collectors.maxBy(Double::compare))));
	     
//	     employees.stream().collect(Collectors.groupingBy(Employee::getEmp_dept,Collectors.collectingAndThen(Collectors.maxBy(Double::compare),e->e.map(Double::longValue).orElse(0L))));
	}
	}

