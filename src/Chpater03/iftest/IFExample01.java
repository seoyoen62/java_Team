package Chpater03.iftest;

import javax.swing.Spring;

public class IFExample01 {

	public static void main(String[] args) {
		
		//삼항연산자
		//Spring str=age>=8?"학교에 다닙니다":"학교에 다니지 않습니다";
		
		//if
		int age=5;
		if(age>=8) {
		System.out.println("학교에 다닙니다");
		}
		System.out.println("학교에 다니지 않습니다");
		System.out.println("--------------------------");
		
		//2# if
		int age1 = 7;
		if(age1>=8) {
			System.out.println("학교에 다닙니다");
			}
		else{
			System.out.println("학교에 다니지 않습니다");
			}
		

	}

}
