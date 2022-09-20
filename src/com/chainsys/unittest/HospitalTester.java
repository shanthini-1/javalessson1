package com.chainsys.unittest;

import com.chainsys.classandmethods.Hospital;

public class HospitalTester {
	public static void testPatientId() {
		Hospital firstPatient= new Hospital(101);
		firstPatient.setPatientName("Ana");
		System.out.println(firstPatient.getPatientId());
		System.out.println(firstPatient.getPatientName());
	}
public static void testPatientAge(){
	Hospital firstPatient = new Hospital(101);
	firstPatient.setPatientAge(23);
	System.out.println(firstPatient.getPatientAge());
}
public static void testBpLevel(){
	Hospital firstPatient = new Hospital(101);
	firstPatient.setBpLevel((float) 100.3);
	System.out.println(firstPatient.getBpLevel());
}
public static void testDiabeticLevel(){
	Hospital firstPatient = new Hospital(101);
	firstPatient.setDiabeticLevel((float)23.24);
	System.out.println(firstPatient.getDiabeticLevel());
}
public static void testAdmissionDate(){
	Hospital firstPatient = new Hospital(101);
	firstPatient.setAdmissionDate("25 mar 2022");
	System.out.println(firstPatient.getAdmissionDate());
}
	
}
