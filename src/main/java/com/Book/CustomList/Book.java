package com.Book.CustomList;


public class Book 
{
	
	String bookName;
	String authorName;
	double price;
	
	public Book(String bookName, String authorName, double price) 
	{
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
	}
	
	@Override
	public String toString() 
	{
		return "Book Name: "+bookName+"\nAuthor Name: "+authorName+"\nPrice: "+price+" TK";
	}
	
	
	

}
