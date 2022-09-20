package com.chainsys.classandmethods;

public class Hospital {
	private final int patientId;
	private String patientName;
	private int patientAge;
	private float bpLevel ;
	private float diabeticLevel;
	private String admissionDate;
//constructor
	public Hospital(int id){
		this.patientId = id; 
	}
	public int getPatientId() {
		return patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(int age) {
		this.patientAge = age;
	}
	public float getBpLevel() {
		return bpLevel;
	}
	public void setBpLevel(float d) {
		this.bpLevel = d;
	}
	public float getDiabeticLevel() {
		return diabeticLevel;
	}
	public void setDiabeticLevel(float diabeticLevel) {
		this.diabeticLevel = diabeticLevel;
	}
	public String getAdmissionDate() {
		return admissionDate;
	}
	public void setAdmissionDate(String admissionDate) {
		this.admissionDate = admissionDate;
	}
	
}