package Chpater02;

import java.util.Scanner;

public class Chpater03 {
	
	//공용으로 사용하는 고정된 메인
	public static void main(String[] args) {
		//#1
		//삼항연산자를 이용하여 score1이 60 보다 크거나 같으면 합격
		//그렇지 않으면 불합격으로 반환 하시오
		//조건?긍정:부정
		
		int score1=60;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("score:");
		int score = scan.nextInt();
		String pass = (score>=60)?"합격":"불합격"; //한글자 이상이면 스트링
		System.out.println(pass+"입니다.");
		
		//#2
		//삼항연산자를 이용하여 score2가 90보다 크면 'A'이고
		//score2가 80보다 크면 'B' 그 이하는 모두 'C'로 간주한다
		
		System.out.println("score2:");
		int score2 = scan.nextInt();
		
		char grade=score2>90?'A':((score2>80)?'B':'C');//한글자면 char
		System.out.println("학점:"+grade);
		
		
		
		
		
		
		
		
		
		
		

	}

}
