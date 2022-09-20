package com.chainsys.javatest;

//import com.chainsys.javatest.EmployeeAbcBank;
//import com.chainsys.javatest.CustomerAbcBank;

public class AbcBank {
	private final int branchId ;

	public AbcBank(int id) {
		this.branchId=id;
	}
	public int getBranchId() {
		return branchId;
	}	

	public static void testemployeeid ()
	{
		EmployeeAbcBank firstEmployee = new EmployeeAbcBank(1234);
		System.out.println(firstEmployee.getEmpId());
	}	
	
	public static void testemployeename()
	{
		EmployeeAbcBank firstEmployee = new EmployeeAbcBank(1234);
		firstEmployee.setEmpNname("lekha");
		System.out.println(firstEmployee.getEmpNname());
	}	
	
	public static void testemployeeaddress()
	{
		EmployeeAbcBank firstEmployee = new EmployeeAbcBank(1234);
		firstEmployee.setEmpAddress("12 nehru street,madurai");
		System.out.println(firstEmployee.getEmpAddress());
	}

	public static void testemployeephoneno()
	{
		EmployeeAbcBank firstEmployee = new EmployeeAbcBank(1234);
		firstEmployee.setEmpPhoneNo(56457_86523L);
		System.out.println(firstEmployee.getEmpPhoneNo());
	}
	public static void testemployeeemailid()
	{
		EmployeeAbcBank firstEmployee = new EmployeeAbcBank(1234);
		firstEmployee.setEmpEmailId("lekha1234@hotmail.com");
		System.out.println(firstEmployee.getEmpEmailId());
	}
	public static void testcustomeraccountno()
	{
		CustomerAbcBank firstCustomer = new CustomerAbcBank(3000234);
		System.out.println(firstCustomer.getcAcconutNumber());
		}
	public static void testcustomername()
	{
		CustomerAbcBank firstCustomer = new CustomerAbcBank(3000234);
		firstCustomer.setcNname("Abi");
		System.out.println(firstCustomer.getcNname());
	}
	public static void testcustomeraddress()
	{
		CustomerAbcBank firstCustomer = new CustomerAbcBank(3000234);
		firstCustomer.setcAddress("2a,ssnagar,madurai");
		System.out.println(firstCustomer.getcAddress());
	}
	public static void testcustomerphoneno()
	{
		CustomerAbcBank firstCustomer = new CustomerAbcBank(3000234);
		firstCustomer.setcPhoneNo(56789_12345L);
		System.out.println(firstCustomer.getcPhoneNo());
	}
	public static void testcustomeremailid()
	{
		CustomerAbcBank firstCustomer = new CustomerAbcBank(3000234);
		firstCustomer.setcEmailId("Abi@hotmail.com");
		System.out.println(firstCustomer.getcEmailId());
	}
	
	public static void testcustomeraccounttype()
	{
		CustomerAbcBank firstCustomer = new CustomerAbcBank(3000234);
		firstCustomer.setAccountType("Savings");
		System.out.println(firstCustomer.getAccountType());
	}

	
	    
}