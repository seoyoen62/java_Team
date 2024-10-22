package Chpater05;

import java.util.Scanner;

public class Method {
	//메서드1
public void makeBread() {//public생략가능
	//메서드 오버로딩기법

	System.out.println("빵 만듭니다.");
	}

//메서드2
	void makeBread(int cnt) {
		for(int i=1;i<=cnt;i++) {//cnt가 돌아
			System.out.println("빵"+i+"개");//출력
		}
		System.out.println("빵"+cnt+"개가 완성 되었습니다");//출력
	}
	//메서드3
	void makeBread(int cnt, String str) {//메서드(함수)int안에cnt,String안에str
		for(int j=1;j<=cnt;j++) {
			System.out.println(str+"빵 "+j+"개");
		}
		System.out.println("요청하신"+cnt+"개의 "+str+"빵이 완성 되었습니다");
	}

	//------------------------------------------
	
	void order() {
		
		boolean run=true;
		Scanner scan=new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1. 빵 개수만 선택 | 2.빵 개수와 종류 선택 | 3.종료");
			System.out.println("------------------------------------------");
			System.out.println("선택>>");
			
			int input_num=Integer.parseInt(scan.nextLine());//nextInt는 엔터 안먹고 다음거에먹음
					
			switch(input_num){
				case 1:
					System.out.print("빵 갯수를 입력:");
					int cnt1=Integer.parseInt(scan.nextLine());//입력받는애
					makeBread(cnt1);
					break;
				case 2:
					System.out.print("빵 갯수를 입력: ");
					int cnt2=Integer.parseInt(scan.nextLine());
					System.out.print("빵 종류를 입력: ");
					String str = scan.nextLine();
					makeBread(cnt2, str);
					break;
					
				case 3:
					System.out.println("프로그램 종료");
					run=false;
					break;
					
				default:
			}//s
			
			
		}//w
		
		
}

}
