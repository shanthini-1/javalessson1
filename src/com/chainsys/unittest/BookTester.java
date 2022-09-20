package com.chainsys.unittest;

import com.chainsys.classandmethods.Book;

public class BookTester {

	public static void testBookId ()
	{
		Book firstbook = new Book(1234);
		firstbook.setBookName("harrypotter");
		System.out.println(firstbook.getBookId());
		System.out.println(firstbook.getBookName());
	}	
	
	public static void testAuthor()
	{
		Book firstEmployee = new Book(1234);
		firstEmployee.setAuthor("jk Rowling");
		System.out.println(firstEmployee.getAuthor());
	}	
	
	public static void testRate ()
	{
		Book firstEmployee = new Book(1234);
		firstEmployee.setRate(250);
		System.out.println(firstEmployee.getRate());
	}	
	
	public static void testPublicationYear ()
	{
		Book firstEmployee = new Book(1234);
		firstEmployee.setPublicationYear(2000);
		System.out.println(firstEmployee.getPublicationYear());
	}	
	
	
	
}
