package Chpater06;

public class BuyCoffee {

	public static void main(String[] args) {
		//고객2명 생성(kim 12000, park 10000)
		Customer kim=new Customer("kim", 12000);
		Customer park=new Customer("park", 12000);
		
		//카페 생성(키페객체이름-> 힘이나는 커피)
		Cafe cafeA=new Cafe("힘이나는 커피");
		
		//카페 방문(힘이나는 커피->kim 4000/park 4500)
		kim.visitCafe(cafeA, 4000);
		park.visitCafe(cafeA, 4500);
		
		//카페정보
		cafeA.showInfo();
		
		//고객들의 정보
		kim.showInfo();
		park.showInfo();
	}

}
