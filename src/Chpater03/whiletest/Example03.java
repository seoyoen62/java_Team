package Chpater03.whiletest;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		
		boolean run=true;
		int balance = 0; //����(+),���(-)
		
		Scanner scan=new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-------------------------------------");
			System.out.println("����>");
			
			//nextInt()�� ������ ���ͷ� �߻��Ǵ� ���� ����
			int manuNum=Integer.parseInt(scan.nextLine());
			//nextInt()�� ������ �������� ���͸� �Է��ϸ� ������ ���ڿ����� �Էµ�
			//int manuNum=scan.nextInt();
			
			switch (manuNum) {
			case 1:
				System.out.print("���ݾ�> ");
				int money= Integer.parseInt(scan.nextLine());
				//int money= scan.nextInt();
				balance += money;
				break;
				
			case 2:
				System.out.print("��ݾ�> ");
				int money2= Integer.parseInt(scan.nextLine());
				balance -= money2;
				//balance -= Integer.parseInt(scan.nextLine());
				break;
				
			case 3:
				System.out.print("�ܰ�> ");
				System.out.println(balance);
				break;
			
			case 4: 
				run=false;
				break;
				
				
			
			}//s
			System.out.println();
		}//w
		System.out.println("���α׷� ����");
	}//m

}//c
