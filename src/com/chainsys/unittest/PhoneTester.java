package com.chainsys.unittest;

import com.chainsys.classandmethods.Phone;

public class PhoneTester {
	public static void testPhone()
	{
	Phone mobile=new Phone(12345_13456);
	mobile.setFrontCameraPixel(16);
	mobile.setRearCameraPixel(64);
	mobile.setCost(20000);
	mobile.setModel("Redmi 10 pro");
	mobile.setManufacturer("2020");
	mobile.setMemory(128);
	mobile.setDataOfPurchase("12-02-2001");
	mobile.setPlanDetails("199");
	System.out.println(mobile.getPhoneNo());
	System.out.println(mobile.getFrontCameraPixel()+"MP");
	System.out.println(mobile.getRearCameraPixel()+"MP");
	System.out.println(mobile.getCost());
	System.out.println(mobile.getModel());
	System.out.println(mobile.getManufacturer());
	System.out.println(mobile.getMemory()+"GP");
	System.out.println(mobile.getDataOfPurchase());
	System.out.println(mobile.getPlanDetails());

	}
	

}
