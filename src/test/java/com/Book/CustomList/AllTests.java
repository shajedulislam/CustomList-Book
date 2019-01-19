package com.Book.CustomList;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(AddingTest.class);
		suite.addTestSuite(GetTest.class);
		suite.addTestSuite(RemoveTest.class);
		suite.addTestSuite(SizeTest.class);
		//$JUnit-END$
		return suite;
	}

}
