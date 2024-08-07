package igt.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class IncrementSalaryBasedOnRating {
		public static void main(String[] args) {
			List<Person> empList = Arrays.asList(
				new Person(3, 3000.0),
				new Person(4, 4000.0),
				new Person(5, 5000.0)
				);
		Map<Integer, Double> collect = empList.stream().collect(Collectors.toMap(
				
				Person :: getRating,
				e->{
					double salary = e.getSalary();
				double percentage =e.getRating()==3?0.10:
					e.getRating()==4?0.30:
					e.getRating()==5?0.50:0.0;
					return salary * (1+percentage);
							}
				));
		System.out.println(collect);
		
	}

}
