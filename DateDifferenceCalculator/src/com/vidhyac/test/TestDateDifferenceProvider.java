package com.vidhyac.test;

import com.vidhyac.service.DateDifferenceProvider;
import com.vidhyac.service.supp.MyDate;
import com.vidhyac.service.supp.MyTestRecord;

public class TestDateDifferenceProvider {
	
	
	public static void main(String[] args) {
		DateDifferenceProvider provider = new DateDifferenceProvider();
		MyTestRecord[] myTestRecords = new MyTestRecord[15];
		myTestRecords[0] = new MyTestRecord(new MyDate(20, 11, 2018), new MyDate(20, 11, 2018), 0);//same yr mo date
		myTestRecords[1] = new MyTestRecord(new MyDate(20, 11, 2018), new MyDate(27, 11, 2018), 7);//same mon yr bt dif date
		myTestRecords[2] = new MyTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 05, 2011), 42);//same yr but next mon & date
		myTestRecords[3] = new MyTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 06, 2011), 73);//intervinig months bt same year
		myTestRecords[4] = new MyTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 12, 2011), 256);//more than 6 months diff
		myTestRecords[5] = new MyTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 12, 2012), 622);//year diff
		myTestRecords[6] = new MyTestRecord(new MyDate(06, 04, 2013), new MyDate(18, 12, 2015), 986);//intervining year
		
		myTestRecords[7] = new MyTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 12, 2113), 37511);//intervining century
		myTestRecords[8] = new MyTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 12, 2413), 147084);//intervinig 400 century
		myTestRecords[9] = new MyTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 12, 2813), 293181);//intervinig 800 century
		myTestRecords[10] = new MyTestRecord(new MyDate(06, 01, 2011), new MyDate(06, 03, 2011), 59);//cons feb month but its non leap year
		myTestRecords[11] = new MyTestRecord(new MyDate(06, 01, 2012), new MyDate(06, 03, 2012), 60);//cons feb month but its a leap year
		myTestRecords[12] = new MyTestRecord(new MyDate(06, 02, 2012), new MyDate(06, 03, 2012), 29);//same year & cons feb mon,leap yr but diff date and next month
		myTestRecords[13] = new MyTestRecord(new MyDate(22, 01, 2012), new MyDate(15, 11, 2012), 298);//same year & cons feb mon,leap yr but diff date and intervinig months
		myTestRecords[14] = new MyTestRecord(new MyDate(06, 02, 2012), new MyDate(06, 12, 2012), 304);//same year & cons feb mon,leap yr but diff date and more than 6 months
			
		
		for(int index=0;index < myTestRecords.length;index++)
		{	
			//int actualDifference=0;
			
			int calculatedDiff=provider.getDateDifference(myTestRecords[index].startDate, myTestRecords[index].endDate);
			if(calculatedDiff == myTestRecords[index].actualDifference){
				System.out.println((index+1)+") Testcase Passed");
			}
			else
				System.err.println((index+1)+") TestCase failed " + "Actual= "+myTestRecords[index].getActualDifference()+ " Calculated= "+calculatedDiff);
		}
		
		
	}
	
	
}
