package Chpater03.swtchtest;

import javax.swing.JOptionPane;

public class swtchtestCase02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		num=Integer.parseInt(JOptionPane.showInputDialog("1~4������ ��ȣ�� �Է��ϼ���"));
		
		switch (num) {
		case 1:
			System.out.println("������ȸ�� �����ϼ̽��ϴ�.");
			break;
		case 2:
			System.out.println("����� �����ϼ̽��ϴ�.");
			break;
		case 3:
			System.out.println("�Ա��� �����ϼ̽��ϴ�.");
			break;
		case 4:
			System.out.println("�۱��� �����ϼ̽��ϴ�.");
			break;
		default:
			System.out.println("��ȣ�� �� �� �Է��ϼ̽��ϴ�.");
		}
	}

}

