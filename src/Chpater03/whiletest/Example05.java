package Chpater03.whiletest;

import java.util.Random;
import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		/*���� ���߱� ����
		1���� 100���� ������ ���ڸ� �����ϰ�, ���ڸ� ���ߴ� ����
		���� �Է��� ���ڰ� ��ǻ�Ͱ� ������ ���ں��� ũ�� "�� ���� ���ڸ� �����ϼ���" ���
		���� �Է��� ���ڰ� ��ǻ�Ͱ� ������ ���ں��� ������ "�� ū ���ڸ� �����ϼ���" ���
		������ ���ڸ� ��Ȯ�� ���� ������ ������ �ݺ�
		���⶧���� �ɸ� �õ� Ƚ���� ����Ͽ� ������ �޽����� ���*/
		
		Scanner scan=new Scanner(System.in);
		
		Random random = new Random();
		//PC�� ���� ����
		int targetNumber=random.nextInt(100)+1;//pc
		int guest;//��
		int count = 0;
		
		System.out.println("1���� 100���� ���ڸ� ���纸����.");
		
		//-------------------------------------------------
		do {
			System.out.println("���ڸ� �Է��ϼ���: ");
			guest = scan.nextInt();//��
			count++;
			
			if (targetNumber > guest) {
				System.out.println("�� ū ���ڸ� �����ϼ���");
			} else if (targetNumber < guest) {
				System.out.println("�� ���� ���ڸ� �����ϼ���");

			}
		}while(guest != targetNumber);
		
		//���
		System.out.println("�����մϴ�. ! "+count+"�� ���� ���߾����ϴ�");
		System.out.println("PC�� ������ ���� : "+targetNumber);
		System.out.println("User�� ������ ���� : "+guest);
		

		}//m
	}//c
