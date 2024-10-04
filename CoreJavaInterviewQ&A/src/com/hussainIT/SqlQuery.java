package com.hussainIT;

public class SqlQuery {
	//To find the 2nd highest salary from the employee table for employees whose names start with 'J'
	
	SELECT MAX(salary) AS second_highest_salary
	FROM employee
	WHERE name LIKE 'J%' AND salary < (
	    SELECT MAX(salary)
	    FROM employee
	    WHERE name LIKE 'J%'
	);

   //ReentrantLock class in java explain 
	//how can find the list of the bean name in the spring framework
	Numbers table-
	Number
	3
	1
	4
	1
	5
	9
	2
	6
	9
	Find the largest single number. 
	
	SELECT Number
	FROM Numbers
	ORDER BY Number DESC
	LIMIT 1 OFFSET 1;
	
	
	
}
