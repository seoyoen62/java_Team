package Chpater03.whiletest;

import java.util.Scanner;

public class whiletest05 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.println("Java������ ������ �Է��ϼ���:");
			int scr=scan.nextInt();
			
			//if -> 60�� �̻��̸� �հ� �׹ۿ� ���հ�
			//0���� 100�ʰ��� "0~100������ ������ �Է� �����մϴ�."
			//OR->||
			
			/*if(scr < 0 || scr>100) {
				System.out.println("0~100������ ������ �Է� �����մϴ�.");
				break;
			}
			else if (scr >= 60) {
				System.out.println( "�հ�");
				break;
			} 
			else {
				System.out.println("���հ�");
				break;
			}//if*/
			
			//AND->&&
			//60�̻��̸鼭 100���ϴ� �հ� 0�̻��̸鼭 50���ϸ� ���հ�
			
			if(scr>=60 && scr<=100) {//60~100
				System.out.println( "�հ�");
				break;
			}else if (scr<60 && scr>=0) {//0~59
				System.out.println( "���հ�");
				break;
			}else {
				System.out.println("0~100������ ������ �Է� �����մϴ�.");
				break;
			}
			
			
		}//w
		System.out.println("���α׷� ����");
		
	}

}
