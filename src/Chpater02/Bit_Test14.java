package Chpater02;

public class Bit_Test14 {

	public static void main(String[] args) {
		
		int num=0B00000101;
		System.out.println(num);
		
		System.out.println(num << 2); //5*4
		System.out.println(num >> 2);//5/4
		System.out.println("=============================");
		
		int a,b,c;
		a=5;
		b=2;
		c=a>>b;
		System.out.println(c);
		
		c=a<<b;
		System.out.println(c);
		
		

	}

}
