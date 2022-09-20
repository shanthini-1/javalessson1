package com.chainsys.classandmethods;

public class Employee {

	private final int empId;
	private String name;
	private String city;
	private long salary;
	//constructor
	public Employee(int id)
	{
		this.empId=id;
	}
	public int getEmpId() {
		return empId;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;

	}
	
	public void setCity(String city) {
		this.city=city;
	}
	
	public String getCity() {
		return city;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary=salary;
	}
	
	
	
}
