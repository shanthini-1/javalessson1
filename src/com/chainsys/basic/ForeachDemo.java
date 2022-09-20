package com.chainsys.basic;

public class ForeachDemo {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int result = 0;
		for (double i : a)
			result += i;
		System.out.println(result);

		String[] a1 = { "1", "2", "3", "4" };
//  int result = 0;
		for (String i : a1)
			System.out.println(i);
		
	}

}
