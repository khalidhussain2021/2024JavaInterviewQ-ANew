package com.interview.prog;

public class CacheProgram {
	/*
	 * 1. add required dependencies in pom.xml like redis cache
	 * 2. will configure cache property in properties file
	 * 2. enable caching using @EnableCaching annotation
	 *   @SpringBootApplication  
@EnableCaching   
public class SpringBootCachingApplication   
{  
public static void main(String[] args)   
{  
SpringApplication.run(SpringBootCachingApplication.class, args);  
}  
}
3.@RestController  
public class CustomerController   
{  
@RequestMapping("/customerinfo")  
//defines a cache for method's return value  
@Cacheable(value="customerInfo")  
public List customerInformation()  
{  
System.out.println("customer information from cache");  
//adding customer detail in the List  
    List detail=Arrays.asList(new Customer(5126890,"Charlie Puth","Current A/c", 450000.00),  
                              new Customer(7620015,"Andrew Flintoff","Saving A/c", 210089.00)  
                             );  
return detail;  
}  
}  
3. based on required we will add chache annotation
@CachacheConfig for class level
@Cachable we will write on method level to get data from cache
@CachePut -It is used when we want to update the cache without interfering the method execution
when we want to remove stale or unused data from the cache @CacheEvict(cacheNames="employees", allEntries=true)
 
@Caching annotation is needed to group multiple annotations when we need to use multiple cache annotations in a single method
@Caching(evict = {
    @CacheEvict(cacheNames = "departments", allEntries = true), 
    @CacheEvict(cacheNames = "employees", key = "...")})
public boolean importEmployees(List<Employee> data) { ... }
	 * 
	 */

}
