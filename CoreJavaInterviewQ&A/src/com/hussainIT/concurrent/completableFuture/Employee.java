package com.hussainIT.concurrent.completableFuture;

public class Employee {
	private String employeeName;
    private String employeeAddress;
    private double employeeSalary;
    private String employeeDepartment;
    private String employeeEmail;
    // Default constructor
    public Employee() {
    }

    // Parameterized constructor
    public Employee(String employeeName, String employeeAddress, double employeeSalary, String employeeDepartment) {
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeeSalary = employeeSalary;
        this.employeeDepartment = employeeDepartment;
        this.employeeEmail=employeeEmail;
    }
    //setter getter tostring

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}
	
	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeAddress=" + employeeAddress + ", employeeSalary="
				+ employeeSalary + ", employeeDepartment=" + employeeDepartment + ", employeeEmail=" + employeeEmail
				+ "]";
	}
	
}
