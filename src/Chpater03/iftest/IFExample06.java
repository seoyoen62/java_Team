package Chpater03.iftest;

import javax.swing.JOptionPane;

public class IFExample06 {

	public static void main(String[] args) {
		// �����ͼ�
		String ID="soldesk";
		int PW=240910;
		
		//��
		String id=JOptionPane.showInputDialog("���̵�");
		
		if(ID.equals(id)) {
		//��й�ȣ
			int pass=Integer.parseInt(JOptionPane.showInputDialog("��й�ȣ"));
			if(PW==pass) {
				System.out.println("�α��� ����");
			}else {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
		}else {
			System.out.println("��ġ�ϴ� �ƴϵ� �����ϴ�.");
		}
	}
}
