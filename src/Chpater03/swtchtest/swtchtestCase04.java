package Chpater03.swtchtest;

import java.util.Scanner;

public class swtchtestCase04 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("ȸ�� ����� ��� �ǳ���?");
		//Aa �ֿ�� ��
		//Bb �����
		//������
		
		//chatAt(0): String->char
		char grade=scan.nextLine().charAt(0);
		
		switch (grade){
		case'A' : case 'a':
				System.out.println("��� ��");
				break;
		case'B' : case 'b':
			System.out.println("�ֿ�� ��");
			break;
		default:
			System.out.println("�Ϲ� ��");
			break;
		}
	}

}
