package Chpater03.iftest;

import javax.swing.JOptionPane;

public class IFExample05 {

	public static void main(String[] args) {
		int num1, num2;
		
		num1=Integer.parseInt(JOptionPane.showInputDialog("��1"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("��2"));
		
		if(num1>num2) {
			System.out.println("num1�� Ů�ϴ�.");
		}else if(num2>num1) {
			System.out.println("num2�� Ů�ϴ�.");
		}else if(num1==num2) {
			System.out.println("�� ���� �����ϴ�.");
		}else  {
			System.out.println("�ٽ� �Է��� �ּ���.");
		}

	}

}
