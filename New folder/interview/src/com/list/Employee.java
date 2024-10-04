package com.list;

import java.util.List;

public class Employee {
	
	private Long id;
	
	private String name;
	
	private Double salary;
	
	private Integer age;
	
	private List<Contact> listContact;

	public Employee(Long id, String name, Double salary, Integer age, List<Contact> listContact) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.listContact = listContact;
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

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public List<Contact> getListContact() {
		return listContact;
	}

	public void setListContact(List<Contact> listContact) {
		this.listContact = listContact;
	}
	
	

	public Employee(Long id, String name, Double salary, Integer age) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + ", listContact="
				+ listContact + "]";
	}
	
}
