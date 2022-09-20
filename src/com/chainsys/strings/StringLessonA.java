package com.chainsys.strings;
/**
 * 
 * @author shan3102
 * created on    :28 mar 2022
 */
public class StringLessonA {
	public static void lessonOne()
	{
		//String is an array of characters
		//demonstration of string creation in different ways
		String firstString = "Chainsys";
		System.out.println(firstString);
		char dataOne[] = {'c','h','a','i','n','s','y','s'};
		String secondString = new String(dataOne);
		System.out.println(secondString);
		String thirdString = new String(new char[] {'c','h','a','i','n','s','y','s'});
		System.out.println(thirdString);
		
	}
	public static void lessonTwo()
	{
		String firstString = "Hello";
		String secondString = "Hello";		
		/*String thirdString = "Hello";
		int firstNumber = 100;
		int secondNumber = 100;
		int thirdNumber = 100;*/
		System.out.println(firstString);
		System.out.println(secondString);
	    firstString = "welcome";
	    System.out.println(firstString);
		System.out.println(secondString);
	    
	}
	public static void creatingStringTnaForLoop()
	{
		for(int count=0;count<10;count++)
		{
			String s1 ="Hello";
			System.out.print(s1+" ");
		}	
	}
	public static void stringTOCharArray() 
	{
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Enter a word: ");
		String firstString  = scanner.nextLine();
		scanner.close();
		int stringLength = firstString.length();
		System.out.println("Length "+stringLength);
		char []data=firstString.toCharArray();
		int dataArrayLength = data.length;
		System.out.println("length "+dataArrayLength);
		
	}
	public static void stringToUpperLower()
	{
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Enter a word: ");
		String firstString  = scanner.nextLine();
		scanner.close();
		System.out.println(firstString);
		String stringInUpperCase = firstString.toUpperCase();
		System.out.println("toUpperCase= "+stringInUpperCase);
		String  stringInLowerCase = firstString.toLowerCase();
		System.out.println("toLowerCase= "+stringInLowerCase);
		System.out.println(firstString);
		//substring
		//from the 4th char till end
		String  subStringA = firstString.substring(3);
		System.out.println("substringA= "+subStringA);
		//from 2rd char to 6th char (i.e excluding 7th char)
		//from index 2 to index 5
		String  subStringB = firstString.substring(2,5);
		System.out.println("substringB= "+subStringB);
		//replace
		String  replacedString = firstString.replace('a','e');
		System.out.println(replacedString);
		//equals
		//consider the address of the string
		boolean flag1 = firstString.equals(stringInUpperCase);//false
		System.out.println(flag1);
		//EqualsIgnoreCase
		//
		boolean flag = firstString.equalsIgnoreCase(stringInUpperCase);//TRUe
		System.out.println(flag);
					
	}
	public static void testStringTrim()
	{
		String secondString = "      Hope    it      rain     ";
		System.out.println("before trim: "+secondString.length());
		secondString = secondString.trim();
		System.out.println("After trim: "+secondString.length());
	}
	public static void testSplitDays()
	{
		String firstString = "   Tom and Jerry are good friends   ";
		String trimmedString = firstString.trim();
		String[] data = trimmedString.split("");
		int count = data.length;	
		System.out.println("word count :"+ count);
		for(int index = 0;index<count;index++)
			System.out.println(data[index]);
		String weekDays = "mon;tue;wed;thu;fri;sat;sun";
		String[] data1 = weekDays.split(";");
		int count1 = data1.length;	
		System.out.println("days count :"+ count1);
		for(int index = 0;index<count1;index++) {
			System.out.println(data1[index]);
		}

	}
	public static void stringReverse() {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("ENTER A SENTENCE: ");
		String sentence="";
		try {
			sentence = scanner.nextLine();
		}
		finally {
			scanner.close();
		}
		//TODO: reverse the sentence here
		System.out.println(sentence);
		String[] split=sentence.split(" ");
		for(int index = split.length-1;index>=0;index--) {
			System.out.print(split[index]+" ");
			}
		
}
	public static void verifyString(String s) 
	{
		if(null==s)
		{
			System.out.println("String is null "+s);
			return;
		}
		else 
		{
			System.out.println("String is not null "+s);
		}
		if(!s.isEmpty())
		{
			System.out.println("String is not empty "+s);
		}
		else 
		{
			System.out.println("String is empty "+s);
		}
		
	}
}
