package com.chainsys.javatest;

public class Printing {
	public static void main(String args[]) {
		for (int count = 1; count <= 100; count++) {

			if (!(count % 3 == 0) && !(count % 5 == 0)) {
				System.out.println(count);
			}
			if ((count % 3 == 0) && (count % 5 == 0)) {
				System.out.println("FizzBuzz");
				continue;
			}
			if (count % 5 == 0)
				System.out.println("Buzz");
			if (count % 3 == 0)
				System.out.println("Fizz");
		}
	}
}
