package Chpater03.iftest;

import javax.swing.JOptionPane;

public class IFExample04 {

	public static void main(String[] args) {
		/*���ð��� ������ ������ �Ƶ��� 1000�� ->7
		���ð��� ������ �ʵ��л��� 2000��->13
		���ð��� ������ ��,����л��� 3500�� ->19
		���ð��� ������ ������ 5000��*/
		
		int age;
		int charge;
		
		age=Integer.parseInt(JOptionPane.showInputDialog("���̸� �Է��ϼ���"));
		
		//#1
		if(age<7) {
			charge=1000;
			System.out.println("������ �Ƶ��Դϴ�.");
		}else if(age<=13) {
			charge=2000;
			System.out.println("�ʵ��л� �Դϴ�");
		}else if(age<=19) {
			charge=2000;
			System.out.println("�� ����л� �Դϴ�");
		}else if(age<=13) {
			charge=2000;
			System.out.println("���� �Դϴ�");
		}
	}

}
