package Chpater02;

import java.util.Scanner;

public class Bit_Test15 {

	public static void main(String[] args) {
		//Ű���� �Է°�
		Scanner scan=new Scanner(System.in);
		
		System.out.print("ù���� ���� �Է�:");
		int num1=scan.nextInt();//0101
		
		System.out.print("�ι��� ���� �Է�:");
		int num2=scan.nextInt();//1010
		
		//System.out.println(num1);
		//System.out.println(num2);
		
		int andResule=num1&num2;//0
		int orResule=num1&num2;//15
		int xorResule=num1&num2;//15
		
		System.out.println("��Ʈ AND ���:"+andResule);
		System.out.println("��Ʈ OR ���:"+orResule);
		System.out.println("��Ʈ XOR ���:"+xorResule);

	}

}
