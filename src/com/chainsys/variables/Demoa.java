package com.chainsys.variables;

public class Demoa {
	public static int DataA;
	//static global variable
	public final int DataB;
	//immutable global variable (not static)
	public final static int DataC=300;
	//constant
	// static
	//private int dataD;
	
	//constructor
	/**
	 * Constructor: is a special method
	 * the name of the constructor and the name of class will be same
	 * constructor don't have return type
	 * Constructors can take parameters
	 * @param dataB
	 */
	public Demoa(int dataB)
	{
		/* Assigning value to the global read-only field(this.dataB) */	 
		this.DataB=dataB;
		
	}
/***
 * greetUser is a non static
 */
	
	public static void sayHello()
	{
		System.out.println("hello developer!!!");
	}
	public void greetUser()
	{
		System.out.println("GREETING USER!!!");
	}
}
