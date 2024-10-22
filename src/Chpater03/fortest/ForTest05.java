package Chpater03.fortest;

import java.util.Scanner;

public class ForTest05 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int i;
		System.out.println("0보다 크면서 11보다 작은 숫자를 입력하세요:");
		int a = scan.nextInt();
		
		if(a>0 && a<11) {
			for(i=1;i<=a;i++) {
				System.out.println("즐추하세요");
			}
		}else {
		System.out.println("입력 값이 잘 못 되어있습니다.");
	}
		System.out.println("프로그램 종료");
}
}
