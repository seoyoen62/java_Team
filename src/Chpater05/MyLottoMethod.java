package Chpater05;

import javax.swing.JOptionPane;

public class MyLottoMethod {

	public static void main(String[] args) {
		
		
		int number = Integer.parseInt(JOptionPane.showInputDialog("원하는 로또 구매 횟수를 입력하세요."));
		
		int cnt = 0;
		System.out.println("====이번주 로또 예상번호====");
		while(number>cnt) {
			System.out.println("["+(cnt+1)+"]: " );
			int[] lotto=new int[6];
			int index = 0;
			//로또번호 6개 출력
			while(index < 6) {
				int num=(int)(Math.random()*45)+1;//0으로 시작하니까 1 더해서 맞춤
				//int=contains(lotto,num)->false
				if(!contains(lotto,num)) {//중복체크 
					lotto[index++]=num;
					
					
				}//if
			}//w
			//로또 6줄 출력
			for(int num:lotto) {
				System.out.print(num+" ");
			}
			System.out.println();
			cnt++;//줄수
		}//w
	}//m
	//----------------------------------------------------------------------------------------------
	//중복체크해주는 메소드
	public static boolean contains(int[]arr,int num) {//int[]; lotto=new int[];,int num
		
		for(int i:arr) {
			if(i==num) {//배열방에 있는 숫자==방금 받은 숫자
				return true;//중복 값이 있다
			}//if
		}//f
			return false;//중복값이 없다
	}//contains
}
