package Chpater05;

public class FuncTest07 {
	
	public static void swap(int x,int y) {//
		int temp=x;
				x=y;
				y=temp;
		
		System.out.println("swap()결과값:x="+x+", y="+y);
		
	}

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		System.out.println("swap()호출전: a="+a+", b="+b);
		System.out.println("============================================");
		
		//Call by Reference
		swap(a,b);
		System.out.println("swap()호출후: a="+a+", b="+b);
		System.out.println("============================================");
		
		
		
		
	}

}
