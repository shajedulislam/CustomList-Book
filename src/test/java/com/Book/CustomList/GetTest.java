package com.Book.CustomList;

import junit.framework.TestCase;

public class GetTest extends TestCase {
	
	public void test()
	{
		CustomList<Book> list = new CustomList<>();

        list.add(new Book ("Teach Yourself C++","Herbert Schildt",3500.0));
        
        list.add(new Book ("All The Birds In The Sky","Charlie Jane Anders",2500.0));
        
        Book b = new Book("Teach Yourself C++","Herbert Schildt",3500.0);
        
        assertEquals(b.toString(), list.get(0).toString());
        
	}

}
