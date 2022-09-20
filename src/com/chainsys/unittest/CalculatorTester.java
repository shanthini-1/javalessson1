package com.chainsys.unittest;

import com.chainsys.variables.Calculator;

/**
 * This class is for unit testing the calcuator class and its methods
 * methods to test
 * <list>
 * add(param1,param2)
 * multiply(param1,param2)
 * divide(param1,param2)
 * subtract(param1,param2)
 * </list>
 * @author shan3102
 *@category To test methods Calculator class
 *date: Mar 25 march 2022
 */
public class CalculatorTester {
	/**
	 * 
	 * 
	 * created on : 25 march 2022
	 */
	
	public static void testAdd()
		{
		 int arg1=12;
		 int arg2=6;
		 int output=Calculator.add(arg1, arg2);
		 System.out.println("Result of add is :"+output);		
		}
	public static void testMultiply()
	{
		 int arg1=12;
		 int arg2=6;
		 int output=Calculator.multiply(arg1, arg2);
		 System.out.println("Result of multiply is :"+output);		
			
	}
	public static void testDivide()
	{
		 int arg1=12;
		 int arg2=6;
		 int output=Calculator.divide(arg1, arg2);
		 System.out.println("Result of divide is :"+output);		
			
	}
	public static void testSubtract()
	{
		 int arg1=12;
		 int arg2=6;
		 int output=Calculator.subtract(arg1, arg2);
		 System.out.println("Result of subtract is :"+output);		
				
	}
	
}
