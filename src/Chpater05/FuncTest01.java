package Chpater05;

import javax.swing.JOptionPane;

public class FuncTest01 {
	//�հ� �޼��� ����
	public static void sum(int num1, int num2) {
		int sum=num1+num2;
		System.out.println("�� ���� ��"+sum);
		
	}//sum �޼���

	public static void main(String[] args) {
		
		//�� ���� ��
		int a,b;
		a=Integer.parseInt(JOptionPane.showInputDialog("��1"));
		b=Integer.parseInt(JOptionPane.showInputDialog("��2"));
				
		//int sum=a+b;
		//System.out.println("�� ���� ��"+sum);
		
		sum(a,b);//a,b: �ǸŰ�����
		
		
	}//m

}//c
