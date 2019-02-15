package com.vidhyac.collection;

public class DateOfBirth {
	public int dd;
	public int mm;
	public int yyyy;
	
	public DateOfBirth(int dd,int mm,int yyyy){
		this.dd=dd;
		this.mm=mm;
		this.yyyy=yyyy;
	}

	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public int getYyyy() {
		return yyyy;
	}

	public void setYyyy(int yyyy) {
		this.yyyy = yyyy;
	}

	@Override
	public String toString() {
		return "Date [dd=" + dd + ", mm=" + mm + ", yyyy=" + yyyy + "]";
	}

	
	
	
}
