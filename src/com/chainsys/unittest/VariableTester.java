package com.chainsys.unittest;

import com.chainsys.variables.Demoa;

/**
 * tester class for global variables
 * @author shan3102
 *@category To test Demoa class,its fields,and methods
 *date: Mar 24 2022
 */
public class VariableTester {
	/**
	 * Test static,constant,immutable Variables
	 */
	public static void testGlobalVariable()
	{
		// display the value of static field
		//value is zero(default)
		//DataA is accessed without creating an object
		
		System.out.println("DataA: "+Demoa.DataA);
		/**
		 * display the value of immutable field
		 *this is not possible without object
		 * */
		
		 //System.out.println("DataB: "+Demoa.DataB);
		
		 //display the value of constant field
		 
		System.out.println("DataC: "+Demoa.DataC);
		Demoa.DataA=2345;
	}
	/**
	 * To test how to use Immutable variables of a class
	 * created on 25 mar 2022
	 */
			public static void testImmutableVariable() {
				
				// cannot make a static reference to the non static field 
				// Demoa.DataB
				/**
				 * first create an object for the class
				 * pass an int value as an argument to the constructor 
				 * access the immutable instance field using the object reference
				  */
				Demoa firstObject=new Demoa(123);
				System.out.println(firstObject.DataB);
				/**
				 * value assigned to an immutable field can not be changed
				 * value for the immutable field can be assigned only through the constructor
				 */
				//firstObject.DataB=567;
		}

		/**
		 * calling static method using class name
		 * without creating an object
		 * created on : 25 march 2022
		 */
		public static void testStaticMethod() {
			Demoa.sayHello();
		}
		/**
		 * calling non-static method using object reference
		 * without creating an object,non-static methods can not be called
		 * created on : 25 march 2022
		 */
		public static void testNonStaticMethod() {
			//ERROR
			//Demoa.greetUser();
			Demoa firstObject = new Demoa(1111);
			//call the non static method
			firstObject.greetUser();
		}

		
}

