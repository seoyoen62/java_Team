package Chpater02;

import java.util.Scanner;

public class Chpater03 {
	
	//�������� ����ϴ� ������ ����
	public static void main(String[] args) {
		//#1
		//���׿����ڸ� �̿��Ͽ� score1�� 60 ���� ũ�ų� ������ �հ�
		//�׷��� ������ ���հ����� ��ȯ �Ͻÿ�
		//����?����:����
		
		int score1=60;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("score:");
		int score = scan.nextInt();
		String pass = (score>=60)?"�հ�":"���հ�"; //�ѱ��� �̻��̸� ��Ʈ��
		System.out.println(pass+"�Դϴ�.");
		
		//#2
		//���׿����ڸ� �̿��Ͽ� score2�� 90���� ũ�� 'A'�̰�
		//score2�� 80���� ũ�� 'B' �� ���ϴ� ��� 'C'�� �����Ѵ�
		
		System.out.println("score2:");
		int score2 = scan.nextInt();
		
		char grade=score2>90?'A':((score2>80)?'B':'C');//�ѱ��ڸ� char
		System.out.println("����:"+grade);
		
		
		
		
		
		
		
		
		
		
		

	}

}
