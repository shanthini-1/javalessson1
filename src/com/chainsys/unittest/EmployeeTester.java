package com.chainsys.unittest;

import com.chainsys.classandmethods.Employee;

public class EmployeeTester {
	public static void testemployeeid ()
	{
		Employee firstEmployee = new Employee(1234);
		firstEmployee.setName("shan");
		System.out.println(firstEmployee.getName());
	}	
	
	public static void testemployeename()
	{
		Employee firstEmployee = new Employee(1234);
		firstEmployee.setCity("chennai");
		System.out.println(firstEmployee.getCity());
	}	
	
	public static void testemployeesalary ()
	{
		Employee firstEmployee = new Employee(1234);
		firstEmployee.setSalary(5000);
		System.out.println(firstEmployee.getSalary());
	}	
	
	
	
	}
