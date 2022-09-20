package com.chainsys.javatest;

public class CountandReverseString {
	public static void main(String[] args) {
		String s2 = "Tom and Jerry are good friends";
		System.out.println(s2);
		System.out.println("Number of words in the given String : " + countword(s2));
		System.out.println("Reverse of the given String : ");
		reverse(s2);
	}

	public static int countword(String s) {
		String word[] = s.split(" ");
		int count = word.length;
		return count;
	}

	public static void reverse(String s) {
		char word[] = s.toCharArray();
		int count = word.length;
		for (int i = count - 1; i >= 0; i--) {
			System.out.print(word[i]);
		}

	}

}
