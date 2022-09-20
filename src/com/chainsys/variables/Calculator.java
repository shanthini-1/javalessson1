package com.chainsys.variables;
/**
 * @author shan3102
 *created on : 25 march 2022
 */
public class Calculator {
	
/**
 * Add method :will take 2 values using the following parameters
 * and will add the values.The result of totaling will be returned back to the called
 * This a static method, object reference is not required.
 * 
 * @param param1 of type int
 * @param param2 of type int
 * @return type int
 * 
*/
	public static int add(int param1, int param2) 
	{
		int result=param1+param2;
		return result;
	}
	/**
	 * multiply method :will take 2 values using the following parameters,and will
 multiply the values.The product result will be returned back to the caller
	 * This a static method, object reference is not required.
	 * 
	 * @param param1 of type int
	 * @param param2 of type int
	 * @return type int
	 * 
	*/
		public static int multiply(int param1, int param2) 
		{
			int result=param1*param2;
			return result;
		}
		
		/**
		 * division method :will take 2 values using the following parameters
		 * and will divide the values.The result  will be returned back to the called
		 * This a static method, object reference is not required.
		 * 
		 * @param param1 of type int
		 * @param param2 of type int
		 * @return type int
		 * 
		*/
			public static int divide(int param1, int param2) 
			{
				if(param2==0) {
					System.out.println("ERROR:INVALID ENTRY ZERO");	
					return 0;
					}
				int result=param1/param2;
				
				return result;
			}
			/**
			 * Subtract method :will take 2 values using the following parameters
			 * and will add the values.The result of totaling will be returned back to the called
			 * This a static method, object reference is not required.
			 * 
			 * @param param1 of type int
			 * @param param2 of type int
			 * @return type int
			 * 
			*/
				public static int subtract(int param1, int param2) 
				{
					int result=param1-param2;
					return result;
				}



}
