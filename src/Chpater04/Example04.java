package Chpater04;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		
		//����ڿ��� �ε����� �˰���� ���ڸ� 1�������� 10���� �Է� �޾�,
		//�ش� ������ �ε����� ã�� ����ϴ� ���α׷��� ���弼��.
		//��, ����ڰ� �Է��� ���� �迭 �ε����� ��Ÿ�� �� ���� ��� ã�� �� ���ٴ� ������ ����ϼ���.
		
		int[] numbers = { 10, 3, 2, 1, 4, 8, 7, 9, 5, 6};
		int target;//�˰��������
		int index =-1; 
		//�迭 ������ ã�� ������ ��� �ʱ�ȭ.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("ã����� ���ڸ� 1���� 10���̷� �Է��ϼ���");
		target = scan.nextInt();
		
		for(int i=0;i<numbers.length;i++){
			if(numbers[i] == target) {
				index=i; //���� ���ڸ� ã���� ���� �����
				break;
			}
			
		}//f
		if(index !=-1) {
			System.out.println(target+"��(��)"+index+"����index�� ����");
		}else {
			System.out.println("�����ͺ��̽��� �������� �ʴ� �����Դϴ�.");
		}
			
		}//m
		
	}

