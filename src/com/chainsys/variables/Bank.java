package com.chainsys.variables;
/**
 * 
 * @author shan3102
 * created on 25 march 2022
 */
public class Bank {
   public static int  currentBalance;
   public static String name;
   public static long accountNumber;
	public static int deposit(int paramAmount) {
	  currentBalance = currentBalance+paramAmount;
	  return currentBalance;	
	}
	public static int withdraw(int paramAmount) {
		currentBalance=currentBalance-paramAmount;
		return currentBalance;
	}
	public static void openAccount(String paramName, long paramAccountNumber) {
		 accountNumber=paramAccountNumber;
		 name=paramName;
		 
		
	}
	
}
