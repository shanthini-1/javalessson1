package com.chainsys.javatest;

import java.util.Date;


public class StudentManagement {
	public static void main(String []args) 
	{
/*		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter students details: ");
	 //Employee firstEmployee = new Employee();
	// Student obj = new Student(1001);
	 obj.setsName("lekha");
	// obj.setBirthDate(23/3/2001);
	 obj.setBloodgruop("o positive");
	 obj.setHeight(65);                */
		
	}
	
	
 public class Student{
	 private final int studid;
	 private String sName;
	 private Date birthDate;
	 private String Bloodgruop;
	 private int height;
	 private int marks;
	 //constructor
	 public Student(int sid) {
		 this.studid=sid;
	 }
	public int getStudid() {
		return studid;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getBloodgruop() {
		return Bloodgruop;
	}
	public void setBloodgruop(String bloodgruop) {
		Bloodgruop = bloodgruop;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	 } 
 public class Employee{
	 private final int empid;
	 private String ebloodgroup;
	 private float eheight;
	 //constructor
	 public Employee(int id) {
		 this.empid=id;
	 }
	public int getEmpid() {
		return empid;
	}
	public String getEbloodgroup() {
		return ebloodgroup;
	}
	public void setEbloodgroup(String ebloodgroup) {
		this.ebloodgroup = ebloodgroup;
	}
	public float getEheight() {
		return eheight;
	}
	public void setEheight(float eheight) {
		this.eheight = eheight;
	}
 }
 
}
