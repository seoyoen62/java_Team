package Chpater04;

import java.util.Random;

import javax.swing.JOptionPane;

public class Mylotto2 {

	public static void main(String[] args) {
		//로또번호 6개를 담을 배열
		int number;
		int cnt=0;
		int[] lotto=new int[6];
		
		System.out.println("이번주 로또 예상번호");
		number=Integer.parseInt(JOptionPane.showInputDialog("원하는 로또 구매 횟수를 입력하세요"));
		
		while(number > cnt) {
			
			System.out.println("["+(cnt+1)+"]:");
				
				outer:for(int i=0; i<lotto.length;) {
					
					lotto[i]=new Random().nextInt(25)+1;
					//lotto[i]=(int)(Math.random()*45)+1;
					//중복성 비교문
					for(int j=0; j<i; j++) {
						if(lotto[i]==lotto[j]) {
							continue outer;//분기점으로 이동
							
						}//if
						
					}//for
					System.out.print(lotto[i]+" ");
					i++;
				}//for
				//------출력--------
				for (int i=0;i<lotto.length;i++)
				System.out.print(lotto[i]+" ");
				
			
			
		}//while
		

		
	}

}
