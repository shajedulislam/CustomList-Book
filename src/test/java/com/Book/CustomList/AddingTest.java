package com.Book.CustomList;

import junit.framework.TestCase;

public class AddingTest extends TestCase {
	
	public void test()
	{
		CustomList<Book> list = new CustomList<>();

        list.add(new Book ("Teach Yourself C++","Herbert Schildt",3500.0));
        
        Book b = new Book("Teach Yourself C++","Herbert Schildt",3500.0);
        
        assertEquals(b.toString(),list.toString());
        
	}

}
