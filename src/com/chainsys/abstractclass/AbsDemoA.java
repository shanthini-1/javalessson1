package com.chainsys.abstractclass;

public class AbsDemoA {
	//constructor
	public AbsDemoA()
	{
		System.out.println("AbsDemoA Created " +hashCode());
	}
	//instance method
	public void echo()
	{
		System.out.println("AbsDemoA echo "+hashCode());
	}
	//static method
	public static void show()
	{
		System.out.println("AbsDemoA show ");
	}
}
