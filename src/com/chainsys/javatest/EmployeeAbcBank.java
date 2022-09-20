package com.chainsys.javatest;

public class EmployeeAbcBank {
	private final int empId;
	private String empNname;
	private String empAddress ;
	private long empPhoneNo;
	private String empEmailId;
	//constructor
	public EmployeeAbcBank(int empid) {
		this.empId = empid;
		
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpNname() {
		return empNname;
	}
	public void setEmpNname(String empNname) {
		this.empNname = empNname;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public long getEmpPhoneNo() {
		return empPhoneNo;
	}
	public void setEmpPhoneNo(long empPhoneNo) {
		this.empPhoneNo = empPhoneNo;
	}
	public String getEmpEmailId() {
		return empEmailId;
	}
	public void setEmpEmailId(String empEmailId) {
		this.empEmailId = empEmailId;
	}
}
