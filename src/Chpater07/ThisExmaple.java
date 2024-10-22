package Chpater07;

public class ThisExmaple {

	public static void main(String[] args) {
		ThisEx birth1=new ThisEx();
		//setter
		birth1.prontThis();//객체의 주소가 반환
		birth1.setYear(2024);
		birth1.setMonth(10);
		birth1.setDay(07);
		System.out.println("생년월일: "+birth1.year+"."+birth1.month+"."+birth1.day);
		
		//생성자의 초기화
		ThisEx birth2=new ThisEx(10,07,2024);
		birth2.prontThis();//객체의 주소가 반환
		System.out.println("생년월일: "+birth1.year+"."+birth1.month+"."+birth1.day);
		
		
		//getter
				ThisEx birth3=new ThisEx(10,07,2024);
				birth3.prontThis();//객체의 주소가 반환
				System.out.println("생년월일: ");
				System.out.println(birth3.getYear());
				System.out.println(birth3.getMonth());
				System.out.println(birth3.getDay());
				
		
		
		
		
	}

}
