package Chpater05;

public class FuncTest_Overload01 {

	//멤버변수=필드=속성
	
	//생성자(디폴트 생략)
	
	//오버로딩(메서드의 매개변수를 다르게하여 같은 명칭의 메서드 생성)	
	public void getResult(int a) {
		System.out.println(a+"은(는)int입니다.");
	}
	public void getResult(char a) {
		System.out.println(a+"은(는)char입니다.");
	}
	public void getResult(String a) {
		System.out.println(a+"은(는)String입니다.");
	}
	public void getResult(int a, String b) {
		System.out.println(a+"은(는)int이고,"+b+"는 String입니다.");
	}
	
	//오버로딩(메서드의 매개변수를 다르게하여 같은 명칭의 메서드 생성)	
	

}
