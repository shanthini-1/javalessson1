package com.chainsys.javatest;

public class CustomerAbcBank {
	private final int cAcconutNumber;
	private String cNname;
	private String cAddress ;
	private long cPhoneNo;
	private String cEmailId;
	private String accountType;
	//constructor
	public CustomerAbcBank(int accountno) {
		this.cAcconutNumber = accountno;	
	}
	public int getcAcconutNumber() {
		return cAcconutNumber;
	}
	
	public String getcNname() {
		return cNname;
	}
	public void setcNname(String cNname) {
		this.cNname = cNname;
	}
	public String getcAddress() {
		return cAddress;
	}
	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}
	public long getcPhoneNo() {
		return cPhoneNo;
	}
	public void setcPhoneNo(long cPhoneNo) {
		this.cPhoneNo = cPhoneNo;
	}
	public String getcEmailId() {
		return cEmailId;
	}
	public void setcEmailId(String cEmailId) {
		this.cEmailId = cEmailId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String Type) {
		this.accountType = Type;
	}
}
