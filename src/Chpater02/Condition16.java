package Chpater02;

import java.util.Scanner;

public class Condition16 {

	public static void main(String[] args) {
		
		//���� ����
		int a=10;
		int b=15;
		boolean result;
		
		result=a>=b?true:false;
		System.out.println(result);
		
		int n1=10;
		int n2=20;
		char result2;
		//n1=n1+1
		result2=(++n1 ==n2)?'Y':'N'; //11==20  
		System.out.println(result2);
		
		Scanner scan=new Scanner(System.in);
		System.out.println("���̸� �Է��ϼ���:");
		int age=scan.nextInt();
		
		String result3=age>=19?"����":"�̼���";
		System.out.println(result3);
		

	}

}
