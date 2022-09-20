package com.chainsys.introduction;

public class Fourth {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		taskD();
			}


		public static void taskA() {
    	java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("what is your name?");
		String name = s.nextLine();
		System.out.println(name);
		s.close();
	}
	public static void taskB() {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("enter a number:");
		int firstValue = s.nextInt();
		int result=firstValue * 100;
		System.out.println(result);
	s.close();
	}
	public static void taskC() {
		String s1="100";
		String s2="12";
		System.out.println(s1+s2);
		int x=Integer.parseInt(s1);
		int y=Integer.parseInt(s2);
		int z=x+y;
		System.out.println("z="+z);
		
	}
	public static void taskD() {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("enter your age");
		int age = s.nextInt();
		if(age<=0)	
		System.out.println("Invalid Age");
		else if(age<=18)
			System.out.println("get driving license");
		else
			System.out.println("Happy driving");		
	s.close();
	
	}


}