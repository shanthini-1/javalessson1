package com.chainsys.classandmethods;

public class Book {
	private final int bookId;
	private String bookName;
	private String author;
	private int rate;
 	private int publicationYear;
 	// constructor
 	public Book(int id){
 		this.bookId=id;
 	}
 	public int getBookId() {
 		return bookId;
 	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	
}

