package com.chainsys.javatest;

public class AnswerToQuestions {
	public static void main(String args[]) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Is it raining ?(yes or no) ");
		String answer = input.nextLine();
		String ans = "YES";
		if (ans.equalsIgnoreCase(answer)) {
			System.out.println("please get an Umberlla with you!!!");
		}
			System.out.println("Enter the temperature (in celcius) : ");
			int temperatureInC = input.nextInt();
			input.close();
			if (temperatureInC < 32)
				System.out.println("Please Take a Heavy jacket with you!!!");
			else if (temperatureInC > 32 && temperatureInC < 50)
				System.out.println("Please Take a Light jacket with you!!!");
			else
				System.out.println("no jacket needed!!!");
		
	}
}
