package com.vidhyac.calci;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
//import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	Calculator calculator;
	
	@BeforeClass
	public static void beforeClass(){
		System.out.println("@BeforeClass-->run once before any of the test methods");
		System.out.println();
	}
	@AfterClass
	public static void afterClass(){
		System.out.println("@After Class-->run once after all the test methods have been executed ");
	}
	@Before //run before every @test
	public void before() {
		calculator = new Calculator();
		System.out.println("@Before-->Execute everytime before each of the test methods\t"+calculator.hashCode());
		
		//System.out.println(calculator.hashCode());
	}
	@After //run after every @test
	public void after(){
		System.out.println("@After-->Execute everytime after each of the test methods\t"+calculator.hashCode());
		System.out.println();
		//System.out.println(calculator.hashCode());
		calculator=null;
		
	}
	@Test //run the test method
	public void testAdd() {
		
		int result = calculator.add(50, 25);
		assertEquals(75, result, 0);//assert statements
		System.out.println("ADD TESTCASE PASSED");
	}
	
	@Test //run the test method
	public void testSub() {
		
		int result = calculator.sub(50, 25);
		assertEquals(25, result, 0);
		System.out.println("SUB TESTCASE PASSED");
	}
	
	@Test //run the test method
	public void testDiv() {
		
		int result = calculator.div(50, 25);
		assertEquals(2, result, 0);
		System.out.println("DIV TESTCASE PASSED");
	}
	
	@Test //run the test method
	public void testMul() {
		int result = calculator.mul(50, 25);
		assertEquals(1250, result, 0);
		System.out.println("MUL TESTCASE PASSED");
	}
	
}
