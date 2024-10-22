package Chpater06;

public class Can {
	
	//멤버변수
	private String canName;
	private int price;
	
	//생성자를 통하여 멤버변수 초기화
	public Can (String canName, int price) {
		this.canName=canName;
		this.price=price;
	}
	//get set(set은 안써도됨 왜? 몰라...)
	public String getCanName() {
		return canName;
	}

	public int getPrice() {
		return price;
	}
	
	
	

}
