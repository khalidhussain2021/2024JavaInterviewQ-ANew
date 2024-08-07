package igt.interview;

public class Person {
	
	private Integer rating;
	private Double salary;
	public Person(Integer rating, Double salary) {
		super();
		this.rating = rating;
		this.salary = salary;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Person [rating=" + rating + ", salary=" + salary + "]";
	}


}
