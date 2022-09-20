package com.chainsys.classandmethods;

public class Car {
	private final String regNo;
	private String car;
	private String color;
	private String fuel;
	private int yearOfPurchase;
	//constructor
	public Car(String regNo) {
		this.regNo=regNo;
	}
	public String getRegNo() {
		return regNo;
	}
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public int getYearOfPurchase() {
		return yearOfPurchase;
	}
	public void setYearOfPurchase(int yearOfPurchase) {
		this.yearOfPurchase = yearOfPurchase;
	}
	
}
