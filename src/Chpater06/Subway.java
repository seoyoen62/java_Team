package Chpater06;

public class Subway {
	
	//멤버변수
	public String lineNumber;
	public int passengerCount;
	public int money;
	
	//생성자 lineNumber초기화
	public Subway(String lineNumber) {
		this.lineNumber=lineNumber;
	}
	
	//take메서드
	public void take(int money) {//승객이 낸 돈
		this.money+=money;//버스 수입
		passengerCount++;//승객의 수 증가
	}
	
	public void showinfo() {
		System.out.println(lineNumber+"번 지하철의 승객은"
		+passengerCount+"명이고, 수입은"+money+"입니다." );
	}
}
