package Chpater06;

public class MyDateMain {

	public static void main(String[] args) {
		
MyDate myDate = new MyDate();
		
		myDate.day = 30;
		myDate.month = 9;
		myDate.year = 2024;
		
		System.out.println("오늘은 "+myDate.year+"년 "+myDate.month+
				"월 "+myDate.day+"일 입니다");
	}

}
