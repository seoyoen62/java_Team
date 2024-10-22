package Chpater02;

import java.util.Scanner;

public class Bit_Test15 {

	public static void main(String[] args) {
		//키보드 입력값
		Scanner scan=new Scanner(System.in);
		
		System.out.print("첫번쨰 숫자 입력:");
		int num1=scan.nextInt();//0101
		
		System.out.print("두번쨰 숫자 입력:");
		int num2=scan.nextInt();//1010
		
		//System.out.println(num1);
		//System.out.println(num2);
		
		int andResule=num1&num2;//0
		int orResule=num1&num2;//15
		int xorResule=num1&num2;//15
		
		System.out.println("비트 AND 결과:"+andResule);
		System.out.println("비트 OR 결과:"+orResule);
		System.out.println("비트 XOR 결과:"+xorResule);

	}

}
