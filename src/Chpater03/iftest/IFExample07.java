package Chpater03.iftest;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IFExample07 {

	public static void main(String[] args) {
		
		String ID="soldesk";
		int PW=240910;
		
		//고객
		Scanner scan=new Scanner(System.in);
		System.out.println("아이디:");
		String id = scan.nextLine();
		
		if(ID.equals(id)) {
		//비밀번호
			System.err.println("비밀번호:");
			int pass=scan.nextInt();
			if(PW==pass) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		}else {
			System.out.println("일치하는 아이디가 없습니다.");
		}

	}

}
