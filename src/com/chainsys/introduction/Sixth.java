package com.chainsys.introduction;

import java.util.Scanner;
public class Sixth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swapNumbers();
		
		//findEvenNumbers();
		//checkUserName();
	}
	public static  void checkUserName() {
		Scanner sc=new Scanner(System.in);//input stream
		System.out.println("ENTER YOUR NAME:");//promt a message in the display console
		//get name from the keyboard (),and store the name in a local variable
		String userName = sc.nextLine();
		sc.close();//closing the input stream
		//streams are create and managed by the OS. scanner is just a handle
		
		System.out.println("Name is "+ userName);
		// display the input value recieved
		char[] nameAsCharacters = userName.toCharArray();
		int lengthOfCharArray = nameAsCharacters.length;
		System.out.println("length of your name is: "+ lengthOfCharArray);
		if(lengthOfCharArray<3) {
			System.out.println("Name must have atleast 3 chars");
			return;
		}
		//asciivalue for alphabets is 65 to 90 for UPPER CASE
		String nameInUppercase = userName.toUpperCase();
		//remove blank space before and after the name
		nameInUppercase = nameInUppercase.trim();
		char[] uppercaseCharArray = nameInUppercase.toCharArray();
		lengthOfCharArray = uppercaseCharArray.length;
		int asciiValue =0;
		for(int index=0;index<lengthOfCharArray;index++) {
			asciiValue = (int) uppercaseCharArray[index];
			System.out.println("ASCII: "+ asciiValue);
			if(asciiValue<65||asciiValue>90) {
			if(asciiValue!=32) {
				System.out.println("INVALID CHARACTER IN NAME: ");
			}	return;
			}
				
		}
	}
	
	public static void findEvenNumbers() {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter any 10 digit number:");
	 long value = sc.nextLong();
	 sc.close();
	 long num = value;//to get the original number
	 long remainder=0;
	 while(num>0)	 
	 {
		remainder=num%10;
		if(remainder%2==0) {
			System.out.println(remainder);
		}
	    num=num/10;
	 }
	}
	
	public static void swapNumbers(){
		int x=67;
		int y=12;
		System.out.println("X:"+x+" y:"+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("x:"+x+"y:"+y);
	}
}
