package Chpater05;

public class MethodTest04 {

	
	public static  int add(int a ,int b) {
		return a+b;
	}
	public static  double add(double a1 ,double b1) {
		return a1+b1;
		
	}
	public static void main(String[] args) {
		
		int sum = add(5,10);
		double sumDouble = add(3.5,7.2);
		
		System.out.println("합계(int):"+sum);
		System.out.println("합계(Double):"+sumDouble);
		
	}

}
