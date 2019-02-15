package com.vidhyac.service.supp;

public class MyTestRecord {
	public MyDate startDate;
	//MyDate endDate;
	public MyDate endDate;
	public int actualDifference;
						
	public MyTestRecord(MyDate startDate, MyDate endDate, int actualDifference) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.actualDifference = actualDifference;
	}
	
	public MyDate getStartDate() {
		return startDate;
	}
	public void setStartDate(MyDate startDate) {
		this.startDate = startDate;
	}
	public MyDate getEndDate() {
		return endDate;
	}
	public void setEndDate(MyDate endDate) {
		this.endDate = endDate;
	}
	public int getActualDifference() {
		return actualDifference;
	}
	public void setActualDifference(int actualDifference) {
		this.actualDifference = actualDifference;
	}
	
	
}
