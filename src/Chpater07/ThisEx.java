package Chpater07;

public class ThisEx {
	int day;
	int month;
	int year;
	
	public ThisEx(){}
	
	public ThisEx(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}
	
	public void prontThis() {
		System.out.println(this);
	}
	
	
	
}
