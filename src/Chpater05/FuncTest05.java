package Chpater05;

import java.util.Scanner;

public class FuncTest05 {
	
	//EduStep 메서드 구현
	public static void EduStep(int num) {//void는 리턴x
		if (num == 1) {
			System.out.println("1단계");
		} else if (num == 2) {
			System.out.println("2단계");
		} else if (num == 3) {
			System.out.println("3단계");
		}
	}
	
	//반환값 있음
	public int nextInt(int number) {
		System.out.println("1");
		return number;
	}
	
	public static void main(String[] args) {
		
		
		//사용자로부터 스터디 단계를 입력받아서 EduStep 호출하기
		Scanner scan=new Scanner(System.in);
		System.out.println("스터디 단계를 입력하세요: ");
		int number=scan.nextInt();
		
		EduStep(number);//number는 실 매개변수
		
		FuncTest05 dis = new FuncTest05();
		dis.nextInt(number);
		
		
		
	}

}
