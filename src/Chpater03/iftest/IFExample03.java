package Chpater03.iftest;

import javax.swing.JOptionPane;

public class IFExample03 {

	public static void main(String[] args) {
		
		char grade;
		int jumsu;
		
		jumsu=Integer.parseInt(JOptionPane.showInputDialog("JAVA 점수"));
				
		//1#
		if(jumsu>=90) {
			grade='A';
			System.out.println('A');
		}else if(jumsu>=80) {
			grade='B';
			System.out.println('B');
		}else if(jumsu>=70) {
			grade='C';
			System.out.println('C');
		}else if(jumsu>=60) {
			grade='D';
			System.out.println('D');
		}else {System.out.println('F');
			grade='F';
		}
		System.out.println("당신의 점수는 :"+grade+"입니다");
	}

}
