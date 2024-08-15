package com.hussainIT.arrayList;

public class Employee {
      private int eId;
      private String eName;
      private int eAge;
      private long eSalary;
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int geteAge() {
		return eAge;
	}
	public void seteAge(int eAge) {
		this.eAge = eAge;
	}
	public long geteSalary() {
		return eSalary;
	}
	public void seteSalary(long eSalary) {
		this.eSalary = eSalary;
	}
	public Employee(int eId, String eName, int eAge, long eSalary) {
		this.eId = eId;
		this.eName = eName;
		this.eAge = eAge;
		this.eSalary = eSalary;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eAge=" + eAge + ", eSalary=" + eSalary + "]";
	}
	
}
