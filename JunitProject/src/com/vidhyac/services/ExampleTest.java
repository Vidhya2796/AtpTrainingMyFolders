package com.vidhyac.services;

import org.junit.*;

public class ExampleTest {
	Example example;
	@BeforeClass
	public static void beforeClass(){
		System.out.println("@BeforeClass-->run once before the execution of all the test methods");
		System.out.println();
	}
	
	@AfterClass
	public static void afterClass(){
		System.out.println("@AfterClass-->run once After the execution of all the test methods");
	}
	
	@Before
	public void before(){
		example=new Example();
		System.out.println("@Before-->run everytime before each of the test method's execution\t"+example.hashCode());
	}
	
	@After
	public void after(){
		System.out.println("@After-->run everytime after each of the test method's execution \t"+example.hashCode());
		System.out.println();
		example=null;
	}
	
	@Test
	public void testSquare(){
		System.out.println("THIS IS SQUARE TEST CASE");
		int result=example.square(6);
		Assert.assertEquals(36, result,0);//assert statement
		System.out.println("SQUARE TESTCASE PASSED");
	}
	
	@Test
	public void testAddition(){
		int result=example.addition(40, 60);
		Assert.assertEquals(100, result,0);
		System.out.println("ADDITION TESTCASE PASSED");
	}

	@Test
	public void testConcatenation(){
		String result=example.concatenation("JUnit", "Testing");
		Assert.assertEquals("JUnitTesting", result);
		System.out.println("CONCATENATION TESTCASE PASSED");
	}
}
