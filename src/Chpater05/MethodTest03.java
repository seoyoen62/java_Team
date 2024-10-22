package Chpater05;

public class MethodTest03 {
	
	public static int add(int num1, int num2) {//int num1=5,int num2=7
		return num1+num2;//void가 아니면 무조건 리턴	
	}
	public static void main(String[] args) {
		
		int result=add(5,7);//실매개변수
		System.out.println("result:"+result);
		
		
	}

}
