package Chpater05;

import java.util.Scanner;

public class Method {
	//�޼���1
public void makeBread() {//public��������
	//�޼��� �����ε����

	System.out.println("�� ����ϴ�.");
	}

//�޼���2
	void makeBread(int cnt) {
		for(int i=1;i<=cnt;i++) {//cnt�� ����
			System.out.println("��"+i+"��");//���
		}
		System.out.println("��"+cnt+"���� �ϼ� �Ǿ����ϴ�");//���
	}
	//�޼���3
	void makeBread(int cnt, String str) {//�޼���(�Լ�)int�ȿ�cnt,String�ȿ�str
		for(int j=1;j<=cnt;j++) {
			System.out.println(str+"�� "+j+"��");
		}
		System.out.println("��û�Ͻ�"+cnt+"���� "+str+"���� �ϼ� �Ǿ����ϴ�");
	}

	//------------------------------------------
	
	void order() {
		
		boolean run=true;
		Scanner scan=new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1. �� ������ ���� | 2.�� ������ ���� ���� | 3.����");
			System.out.println("------------------------------------------");
			System.out.println("����>>");
			
			int input_num=Integer.parseInt(scan.nextLine());//nextInt�� ���� �ȸ԰� �����ſ�����
					
			switch(input_num){
				case 1:
					System.out.print("�� ������ �Է�:");
					int cnt1=Integer.parseInt(scan.nextLine());//�Է¹޴¾�
					makeBread(cnt1);
					break;
				case 2:
					System.out.print("�� ������ �Է�: ");
					int cnt2=Integer.parseInt(scan.nextLine());
					System.out.print("�� ������ �Է�: ");
					String str = scan.nextLine();
					makeBread(cnt2, str);
					break;
					
				case 3:
					System.out.println("���α׷� ����");
					run=false;
					break;
					
				default:
			}//s
			
			
		}//w
		
		
}

}
