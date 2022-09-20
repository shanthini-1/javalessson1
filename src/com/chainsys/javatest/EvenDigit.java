package com.chainsys.javatest;

public class EvenDigit {
	public static void main(String[] args) {
		int number = 1546903;
		int remainder = 0;
		System.out.println("Number is: " + number);
		System.out.println("Even numbers in the given number are:");
		while (number > 0) {
			remainder = number % 10;
			if (remainder % 2 == 0)
				System.out.println(remainder);
			number = number / 10;

		}

	}
}
