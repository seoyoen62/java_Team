package Chpater03.swtchtest;

import java.util.Scanner;

public class swtchtestCase04 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("회원 등급은 어떻게 되나요?");
		//Aa 최우수 고객
		//Bb 우수고객
		//나머지
		
		//chatAt(0): String->char
		char grade=scan.nextLine().charAt(0);
		
		switch (grade){
		case'A' : case 'a':
				System.out.println("우수 고객");
				break;
		case'B' : case 'b':
			System.out.println("최우수 고객");
			break;
		default:
			System.out.println("일반 고객");
			break;
		}
	}

}
