package Chpater03.swtchtest;

import javax.swing.JOptionPane;

public class swtchtestCase02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		num=Integer.parseInt(JOptionPane.showInputDialog("1~4사이의 번호를 입력하세요"));
		
		switch (num) {
		case 1:
			System.out.println("예금조회를 선택하셨습니다.");
			break;
		case 2:
			System.out.println("출금을 선택하셨습니다.");
			break;
		case 3:
			System.out.println("입금을 선택하셨습니다.");
			break;
		case 4:
			System.out.println("송금을 선택하셨습니다.");
			break;
		default:
			System.out.println("번호를 잘 못 입력하셨습니다.");
		}
	}

}

