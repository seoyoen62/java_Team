package Chpater02;

import java.util.Scanner;

public class Example06 {

	public static void main(String[] args) {
		
		/*Scanner �� ����Ͽ� 
		�� ���� �Ҹ���(boolean) ���� isSunny�� isWarm�� �Է¹޾�, 
		������ ȭâ�ϸ鼭 �������� ���θ� ����ϴ� ���α׷��� �ۼ��ϼ���.
		(������ ȭâ�ϸ鼭 ���������� ���� ���� isNiceWeather ���� �ۼ��ϼ���.)*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("������ ȭâ�Ѱ���?(true:false) :");
		boolean isSunny=scan.nextBoolean();//false
		
		System.out.println("������ ȭâ�Ѱ���?(true:false) :");
		boolean isWarm=scan.nextBoolean();//true
		
		//�Ǵ�
		boolean isNiceWeather=isSunny && isWarm;
		System.out.println("������ �����ϸ鼭 ȭâ�Ѱ���?:"+isNiceWeather);
		
		
		
		
	}

}
