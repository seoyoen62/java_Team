package Chpater05;

import java.util.Scanner;

public class FuncTest05 {
	
	//EduStep �޼��� ����
	public static void EduStep(int num) {//void�� ����x
		if (num == 1) {
			System.out.println("1�ܰ�");
		} else if (num == 2) {
			System.out.println("2�ܰ�");
		} else if (num == 3) {
			System.out.println("3�ܰ�");
		}
	}
	
	//��ȯ�� ����
	public int nextInt(int number) {
		System.out.println("1");
		return number;
	}
	
	public static void main(String[] args) {
		
		
		//����ڷκ��� ���͵� �ܰ踦 �Է¹޾Ƽ� EduStep ȣ���ϱ�
		Scanner scan=new Scanner(System.in);
		System.out.println("���͵� �ܰ踦 �Է��ϼ���: ");
		int number=scan.nextInt();
		
		EduStep(number);//number�� �� �Ű�����
		
		FuncTest05 dis = new FuncTest05();
		dis.nextInt(number);
		
		
		
	}

}
