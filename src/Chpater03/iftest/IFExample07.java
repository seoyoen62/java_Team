package Chpater03.iftest;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IFExample07 {

	public static void main(String[] args) {
		
		String ID="soldesk";
		int PW=240910;
		
		//��
		Scanner scan=new Scanner(System.in);
		System.out.println("���̵�:");
		String id = scan.nextLine();
		
		if(ID.equals(id)) {
		//��й�ȣ
			System.err.println("��й�ȣ:");
			int pass=scan.nextInt();
			if(PW==pass) {
				System.out.println("�α��� ����");
			}else {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
		}else {
			System.out.println("��ġ�ϴ� ���̵� �����ϴ�.");
		}

	}

}
