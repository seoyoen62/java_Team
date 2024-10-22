package Chpater02;

public class LogicTest11 {

	public static void main(String[] args) {
		int num1=10;
		int i=2;
		
		//||=> OR  
		//&&=> AND
		
		boolean value=((i=i+2) < 10 &&(num1=num1+2)<10);
		System.out.println(i);//4
		System.out.println(num1);//12
		System.out.println(value);//F
		System.out.println("==================");
		
		value=((i=i+2) < 10 || (num1=num1+2)<10); //첫번쨰 조건 만족하면 뒤족 안봄(계산안함)
		System.out.println(i);//6
		System.out.println(num1);//12
		System.out.println(value);//T
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
