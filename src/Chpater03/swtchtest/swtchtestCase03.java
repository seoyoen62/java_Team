package Chpater03.swtchtest;

import java.util.Scanner;

public class swtchtestCase03 {

	public static void main(String[] args) {
		
		int month;
		int day;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("���� �Է��ϼ���(1~12):");
		month = scan.nextInt();
			
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:{
			day=31;
			System.out.println(month+"����"+day+"�� ���� �ֽ��ϴ�.");
			break;
		}
		case 2:{
			day=28;
			System.out.println(month+"����"+day+"�� ���� �ֽ��ϴ�.");
			break;
		}
		case 4: case 6: case 9: case 11:
			day=30;
			System.out.println(month+"����"+day+"�� ���� �ֽ��ϴ�.");
			break;
		
		default: {
			day=0;
			System.out.println("�������� �ʴ� �� �Դϴ�.");
		}
	}//switch
}

}
