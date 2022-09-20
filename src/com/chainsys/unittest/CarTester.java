package com.chainsys.unittest;

import com.chainsys.classandmethods.Car;

public class CarTester {
	public static void testRegNo ()
	{
		Car firstCar = new Car("TN 39 bv 8943");
		firstCar.setCar("Activa");
		System.out.println(firstCar.getRegNo());
		System.out.println(firstCar.getCar());
	}	
	
	public static void testColor()
	{
		Car firstEmployee = new Car("TN 39 bv 8943");
		firstEmployee.setColor("Red");
		System.out.println(firstEmployee.getColor());
	}	
	
	public static void testFuel ()
	{
		Car firstEmployee = new Car("TN 39 bv 8943");
		firstEmployee.setFuel("petrol");
		System.out.println(firstEmployee.getFuel());
	}	
	
	public static void testYearOfPurchase ()
	{
		Car firstEmployee = new Car("TN 39 bv 8943");
		firstEmployee.setYearOfPurchase(2000);
		System.out.println(firstEmployee.getYearOfPurchase());
	}	

}
