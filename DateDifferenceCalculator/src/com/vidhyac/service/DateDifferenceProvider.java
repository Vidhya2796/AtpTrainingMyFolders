package com.vidhyac.service;

import com.vidhyac.service.supp.MyDate;

public class DateDifferenceProvider {
	
	static final int JAN = 31;
	static final int FEB = 28;
	static final int MAR = 31;
	static final int APR = 30;
	static final int MAY = 31;
	static final int JUN = 30;
	static final int JUL = 31;
	static final int AUG = 31;
	static final int SEP = 30;
	static final int OCT = 31;
	static final int NOV = 30;
	static final int DEC = 31;

	int[] months = { JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC };
	//getDateDifference method
	public int getDateDifference(MyDate startDate,MyDate endDate){
		if (sameDate(startDate, endDate) && sameMonth(startDate, endDate) && sameYear(startDate, endDate)) {
			return 0;
		} else if (sameMonth(startDate, endDate) && sameYear(startDate, endDate)) {
			return endDate.getDd() - startDate.getDd();
		} else if (sameYear(startDate, endDate)) {
			return remainingDaysOfMonth(startDate) + daysInIntervingMonth(startDate, endDate) + endDate.getDd();
		} else {
			return remainingDaysOfMonth(startDate) + remainingDaysInYear(startDate) + leadingYear(endDate)
					+ daysInInterveningYear(startDate, endDate);
		}

		//return endDate.getDd() - startDate.getDd();
	}
	
private boolean sameDate(MyDate startDate, MyDate endDate) {
	return endDate.getDd() == startDate.getDd();
}

private boolean sameMonth(MyDate startDate, MyDate endDate) {
	return endDate.getMm() == startDate.getMm();
}

private boolean sameYear(MyDate startDate, MyDate endDate) {
	return endDate.getYyyy() == startDate.getYyyy();
}

private int remainingDaysOfMonth(MyDate date) {
	int year=date.getYyyy();
	int month=date.getMm();
	
	if(((year%4==0 && year%100!=0) || (year%4==0 && year%100==0 && year%400==0 )) && month==02  ){
		return months[month - 1]+1 - date.getDd();
	}
	return months[month - 1] - date.getDd();
}

private int daysInIntervingMonth(MyDate startDate, MyDate endDate) {
	int totalDays = 0,febLeapDay=0;
	int year=startDate.getYyyy();
	for (int index = startDate.getMm() + 1; index < endDate.getMm(); index++) {
		if(index==02 && ((year%4==0 && year%100!=0) || (year%4==0 && year%100==0 && year%400==0 ))){
			febLeapDay=1;
		}
		totalDays += months[index - 1];
	}
	
	return totalDays+febLeapDay;

}

private int daysInInterveningYear(MyDate startDate, MyDate endDate) {

	int remainingdays = 0,leapdays=0;

	for (int year = startDate.getYyyy() + 1; year < endDate.getYyyy(); year++) {
		//leap year
		if((year%4==0 && year%100!=0) || (year%4==0 && year%100==0 && year%400==0 ) ){
			leapdays++;
		}
		remainingdays = remainingdays + 365;
	}

	return remainingdays+leapdays;
}

private int remainingDaysInYear(MyDate startDate) {

	int daysRemaining = 0,febLeapDay=0;
	int year=startDate.getYyyy();
	for (int index = startDate.getMm() + 1; index <= 12; index++) {
		if(index==02 && ((year%4==0 && year%100!=0) || (year%4==0 && year%100==0 && year%400==0 ))){
			febLeapDay=1;
		}
		daysRemaining = daysRemaining + months[index - 1];
	}

	return daysRemaining;
}

private int leadingYear(MyDate endDate) {

	int daysRemaining = 0,febLeapDay=0;
	int year=endDate.getYyyy();
	for (int month = 1; month < endDate.getMm(); month++) {
		if(month==02 && ((year%4==0 && year%100!=0) || (year%4==0 && year%100==0 && year%400==0 ))){
			febLeapDay=1;
		}
		daysRemaining = daysRemaining + months[month - 1];
	}

	daysRemaining = daysRemaining + endDate.getDd();
	return daysRemaining+febLeapDay;
}
	
}
