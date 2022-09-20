package com.chainsys.constructor;

public class ShapeTest {

	public static void main(String[] args) 
	{
//		Shape s1=new Shape();
		/**
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		   The constructor Shape() is not visible

	       at com.chainsys.constructor.ShapeTest.main(ShapeTest.java:7)
	     *private constructor 
		 */
		Shape s1=Shape.getShape();
		s1.display();
	}
}
