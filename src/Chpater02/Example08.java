package Chpater02;

import java.util.Scanner;

public class Example08 {
	public static void main(String[] args) {
		
		//�� ���� ���ڸ� �Է� �޾Ƽ� ù ��°(num1) ���ڰ� �� ��°(num2) ���ں���
		// ū�� ���θ� ����ϴ� ���α׷��� �ۼ��ϼ���.
		Scanner scanner=new Scanner(System.in);
		
		
		System.out.print("ù ���� ���� �Է�: ");
		int num1=scanner.nextInt();
				
		System.out.print("�� ���� ���� �Է�: ");
		int num2=scanner.nextInt();
				
		boolean isGreaterThan=num1>num2;
		System.out.print("ù ���� ���ڰ� �ι��� ���ں��� ū��?: "+isGreaterThan);
		}
}