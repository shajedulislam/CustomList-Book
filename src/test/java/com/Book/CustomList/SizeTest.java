package com.Book.CustomList;

import junit.framework.TestCase;

public class SizeTest extends TestCase {
	
	public void test() {
		
		CustomList<Book> list = new CustomList<>();

        list.add(new Book ("Teach Yourself C++","Herbert Schildt",3500.0));
        
        assertEquals(list.size(),1);
	}

}
