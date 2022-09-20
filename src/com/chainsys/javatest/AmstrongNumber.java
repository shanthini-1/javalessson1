package com.chainsys.javatest;

public class AmstrongNumber {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Enter three digit number: ");
		int number = input.nextInt();
		input.close();
		int remainder = 0;
		int temp = number;
		int sum = 0;
		while (number > 0) {
			remainder = number % 10;
			int cube;
			cube = remainder * remainder * remainder;
			sum = sum + cube;
			number = number / 10;

		}
		if (sum == temp) {
			System.out.println("Same as input number");
		} else
			System.out.println("different number");

	}
}
