package Chpater03.swtchtest;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		
		/*����ڷκ��� ���� �Է¹޾�, �ش� ���� ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
		 * ��:3-5��, ����:6-8��, ����:9-11��, �ܿ�: 12-2��*/
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int month=scan.nextInt();
		String wder="";
		
		switch (month) {
		case 3: case 4: case 5:
			wder="��";
			System.out.println(month+"���� "+wder+"�Դϴ�");
			break;
		case 6: case 7: case 8:
			wder="����";
			System.out.println(month+"���� "+wder+"�Դϴ�");
			break;
		case 9: case 10: case 11:
			wder="����";
			System.out.println(month+"���� "+wder+"�Դϴ�");
			break;
		case 12: case 1: case 2:
			wder="�ܿ�";
			System.out.println(month);
		}
		
		

	}

}
