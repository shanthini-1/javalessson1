package com.chainsys.array;

public class Employee {
	private final long id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	private String name;
	//constructor
	public Employee(long v1) {
		this.id=v1;
	}
	
}
