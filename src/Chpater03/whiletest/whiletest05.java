package Chpater03.whiletest;

import java.util.Scanner;

public class whiletest05 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.println("Java교과목 점수를 입력하세요:");
			int scr=scan.nextInt();
			
			//if -> 60점 이상이면 합격 그밖에 불합격
			//0이하 100초과시 "0~100까지의 점수만 입력 가능합니다."
			//OR->||
			
			/*if(scr < 0 || scr>100) {
				System.out.println("0~100까지의 점수만 입력 가능합니다.");
				break;
			}
			else if (scr >= 60) {
				System.out.println( "합격");
				break;
			} 
			else {
				System.out.println("불합격");
				break;
			}//if*/
			
			//AND->&&
			//60이상이면서 100이하는 합격 0이상이면서 50이하면 불합격
			
			if(scr>=60 && scr<=100) {//60~100
				System.out.println( "합격");
				break;
			}else if (scr<60 && scr>=0) {//0~59
				System.out.println( "불합격");
				break;
			}else {
				System.out.println("0~100까지의 점수만 입력 가능합니다.");
				break;
			}
			
			
		}//w
		System.out.println("프로그램 종료");
		
	}

}
