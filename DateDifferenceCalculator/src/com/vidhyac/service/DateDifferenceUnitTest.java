package com.vidhyac.service;
import static org.junit.Assert.*;

import org.junit.*;

import com.vidhyac.service.supp.MyDate;
import com.vidhyac.service.supp.MyTestRecord;

public class DateDifferenceUnitTest {
	static int num;
	MyTestRecord[] myTestRecords = new MyTestRecord[15];
	DateDifferenceProvider provider ;
	 @BeforeClass
	    public static void runOnceBeforeClass() {
		 	num=1;
	        System.out.println("@BeforeClass - runOnceBeforeClass");
	    }
	
	@Before
	public void runBeforeTestMethod() {
		provider = new DateDifferenceProvider();
        //System.out.println("@Before - runBeforeTestMethod");
        System.out.println("test case "+(num++)+" passed");
    }
	
	@After
	public void runAfterTestMethod() {
        System.out.println("@After - runAfterTestMethod");
    }
	
	@AfterClass
    public static void runOnceAfterClass() {
        System.out.println("@AfterClass - runOnceAfterClass");
    }
	@Test
	public void testDateDifference1(){
		myTestRecords[0] = new MyTestRecord(new MyDate(20, 11, 2018), new MyDate(20, 11, 2018), 0);//same yr no date
		int calculatedDiff=provider.getDateDifference(myTestRecords[0].startDate, myTestRecords[0].endDate);
		assertEquals(0,calculatedDiff,0);
	}
	
	@Test
	public void testDateDifference2(){
		myTestRecords[0] = new MyTestRecord(new MyDate(20, 11, 2018), new MyDate(27, 11, 2018), 7);//same mon yr bt dif date
		int calculatedDiff=provider.getDateDifference(myTestRecords[0].startDate, myTestRecords[0].endDate);
		assertEquals(7,calculatedDiff,0);
	}
	
	@Test
	public void testDateDifference3(){
		myTestRecords[0] = new MyTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 05, 2011), 42);//same yr but next mon & date
		int calculatedDiff=provider.getDateDifference(myTestRecords[0].startDate, myTestRecords[0].endDate);
		assertEquals(42,calculatedDiff,0);
	}
	
	@Test
	public void testDateDifference4(){
		myTestRecords[0] = new MyTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 06, 2011), 73);//intervinig months bt same year
		int calculatedDiff=provider.getDateDifference(myTestRecords[0].startDate, myTestRecords[0].endDate);
		assertEquals(73,calculatedDiff,0);
	}
	
	@Test
	public void testDateDifference5(){
		myTestRecords[0] = new MyTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 12, 2011), 256);//more than 6 months diff
		int calculatedDiff=provider.getDateDifference(myTestRecords[0].startDate, myTestRecords[0].endDate);
		assertEquals(256,calculatedDiff,0);
	}
	
	@Test
	public void testDateDifference6(){
		myTestRecords[0] = new MyTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 12, 2012), 622);//year diff
		int calculatedDiff=provider.getDateDifference(myTestRecords[0].startDate, myTestRecords[0].endDate);
		assertEquals(622,calculatedDiff,0);
	}
	
	@Test
	public void testDateDifference7(){
		myTestRecords[0] = new MyTestRecord(new MyDate(06, 04, 2013), new MyDate(18, 12, 2015), 986);//intervining year
		int calculatedDiff=provider.getDateDifference(myTestRecords[0].startDate, myTestRecords[0].endDate);
		assertEquals(986,calculatedDiff,0);
	}
	
	@Test
	public void testDateDifference8(){
		myTestRecords[0] = new MyTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 12, 2113), 37511);//intervining century
		int calculatedDiff=provider.getDateDifference(myTestRecords[0].startDate, myTestRecords[0].endDate);
		assertEquals(37511,calculatedDiff,0);
	}
	
	@Test
	public void testDateDifference9(){
		myTestRecords[0] = new MyTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 12, 2413), 147084);//intervinig 400 century
		int calculatedDiff=provider.getDateDifference(myTestRecords[0].startDate, myTestRecords[0].endDate);
		assertEquals(147084,calculatedDiff,0);
	}
	
	@Test
	public void testDateDifference10(){
		myTestRecords[0] = new MyTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 12, 2813), 293181);//intervinig 800 century
		int calculatedDiff=provider.getDateDifference(myTestRecords[0].startDate, myTestRecords[0].endDate);
		assertEquals(293181,calculatedDiff,0);
	}
	
	@Test
	public void testDateDifference11(){
		myTestRecords[0] = new MyTestRecord(new MyDate(06, 01, 2011), new MyDate(06, 03, 2011), 59);//cons feb month but its non leap year
		int calculatedDiff=provider.getDateDifference(myTestRecords[0].startDate, myTestRecords[0].endDate);
		assertEquals(59,calculatedDiff,0);
	}
	
	@Test
	public void testDateDifference12(){
		myTestRecords[0] = new MyTestRecord(new MyDate(06, 01, 2012), new MyDate(06, 03, 2012), 60);//cons feb month but its a leap year
		int calculatedDiff=provider.getDateDifference(myTestRecords[0].startDate, myTestRecords[0].endDate);
		assertEquals(60,calculatedDiff,0);
	}
	
	@Test
	public void testDateDifference13(){
		myTestRecords[0] = new MyTestRecord(new MyDate(06, 02, 2012), new MyDate(06, 03, 2012), 29);//same year & cons feb mon,leap yr but diff date and next month
		int calculatedDiff=provider.getDateDifference(myTestRecords[0].startDate, myTestRecords[0].endDate);
		assertEquals(29,calculatedDiff,0);
	}
	
	@Test
	public void testDateDifference14(){
		myTestRecords[0] = new MyTestRecord(new MyDate(22, 01, 2012), new MyDate(15, 11, 2012), 298);//same year & cons feb mon,leap yr but diff date and intervinig months
		int calculatedDiff=provider.getDateDifference(myTestRecords[0].startDate, myTestRecords[0].endDate);
		assertEquals(298,calculatedDiff,0);
	}
	
	@Test
	public void testDateDifference15(){
		myTestRecords[0] = new MyTestRecord(new MyDate(06, 02, 2012), new MyDate(06, 12, 2012), 304);//same year & cons feb mon,leap yr but diff date and more than 6 months
		int calculatedDiff=provider.getDateDifference(myTestRecords[0].startDate, myTestRecords[0].endDate);
		assertEquals(304,calculatedDiff,0);
	}
}
