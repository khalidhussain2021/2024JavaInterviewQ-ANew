package com.hussainIT;

import java.util.ArrayList;
import java.util.List;

class Address {
	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Address(String address) {
		this.address = address;
	}
	
}
class Employee {
	private Integer empId;
	private String empName;
	private List<Address> addsresses;
	public Employee(Integer empId, String empName, List<Address> addsresses) {
		this.empId = empId;
		this.empName = empName;
		this.addsresses = addsresses;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<Address> getAddsresses() {
		return addsresses;
	}
	public void setAddsresses(List<Address> addsresses) {
		this.addsresses = addsresses;
	}
		
}
public class CognizentInterview {

	public static void main(String[] args) {
	
	Address add1=new Address("banglore");
	Address add2=new Address("hyderabd");
	List<Address> addressList=new ArrayList<>();
	addressList.add(add1);
	addressList.add(add2);

	Employee e1=new Employee(1,"khalid",addressList);
	String add = e1.getAddsresses().get(0).getAddress();
    System.out.println(add);
    
	}
	
    
}
