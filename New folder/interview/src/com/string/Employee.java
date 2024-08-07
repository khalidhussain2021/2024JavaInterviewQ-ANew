package com.string;

public class Employee {
 private Long id;
 private String name;
 private Double salry;
public Employee(Long id, String name, Double salry) {
	this.id = id;
	this.name = name;
	this.salry = salry;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getSalry() {
	return salry;
}
public void setSalry(Double salry) {
	this.salry = salry;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salry=" + salry + "]";
}
 


}
