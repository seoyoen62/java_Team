package Chpater05;

public class Example02 {
	
	//두 정수를 입력받아서(=매개변수) 그 합을 계산하는 메소드를 구현
	
	//반환값이 있는 메서드
	public static int sum(int a, int b) {
		return a+b;
	}
	
	//반환값이 없음
	public static void sum1(int a, int b) {
		int sum1=a+b;
		System.out.println(sum1);
		
	}//

	public static void main(String[] args) {
		
		int num1=10;
		int num2=20;
		
		//반환값이 있는 메서드
		int a =sum(num1,num2);
		System.out.println("반환값 출력"+a);
		
		//반환값이 없음
		sum1(num1,num2);
		
		}//m
}
