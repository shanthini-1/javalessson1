package com.chainsys.javatest;

import java.util.Scanner;

public class Charcheck {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		input.close();
		//containsNumber(name);
		System.out.println("Entered Name is: " + name);
	}

	public static void containsNumber(String s) {
		char[] cName = s.toCharArray();
		int asciiOfName;
		for (int i = 0; i < cName.length; i++) {
			asciiOfName = ((int) cName[i]);
			if (asciiOfName >= 48) {
				if (asciiOfName <= 57) {
					System.out.println("Please enter characters only!!! (Name contains number)");
					break;
				}
			}
		}
		if (cName.length < 8)
			System.out.println("please enter valid name!!! (Number of characters is less than 8)");

	}
}