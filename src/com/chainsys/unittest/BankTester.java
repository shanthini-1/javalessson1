package com.chainsys.unittest;
import com.chainsys.variables.Bank;
import java.util.Scanner;
/**
 * 
 * @author shan3102
 *
 */
public class BankTester {
	
	public static void testOpenAccount()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Name:");
		String cust_name = input.nextLine();
		System.out.println("Enter your Account:");
		long account_num= input.nextLong();
		
		Bank.openAccount(cust_name, account_num);
		System.out.println("Account Holder Name: "+Bank.name);
		System.out.println("Account Number: "+Bank.accountNumber);
		System.out.println("Balance:"+Bank.currentBalance);
		System.out.println("Enter 1 -> Withdraw\nEnter 2 -> Deposit");
		int decision = input.nextInt();
		
		if(decision == 1) {
			testWithdraw();
		}
		else if (decision==2) {
			testDeposit();
		}
		else
		{
			System.out.println("invalid entry");
		}
		input.close();
	}
	
	public static void testWithdraw()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Balance:"+Bank.currentBalance);
		System.out.println("Enter the amount to withdraw:");
		int amount = input.nextInt();
	
		System.out.println(amount+" Ruppees withdrawed");
		System.out.println("Current Balance:"+Bank.withdraw(amount));
	input.close();
	}
	public static void testDeposit()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount to Deposit:");
		int amount = input.nextInt();
		System.out.println("Before Balance:"+Bank.currentBalance);
		int depo=Bank.deposit(amount);
		System.out.println(amount+" Ruppees Deposited");
		System.out.println("Current Balance:"+depo);
	input.close();
	}


}
