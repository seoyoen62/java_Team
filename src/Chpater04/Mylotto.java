package Chpater04;

import java.util.Random;

import javax.swing.JOptionPane;

public class Mylotto {

	public static void main(String[] args) {
		//�ζǹ�ȣ 6���� ���� �迭
		int number;
		int cnt=0;
		int[] lotto=new int[6];
		
		System.out.println("�̹��� �ζ� �����ȣ");
		number=Integer.parseInt(JOptionPane.showInputDialog("���ϴ� �ζ� ���� Ƚ���� �Է��ϼ���"));
		
		while(number > cnt) {
			
			System.out.println("["+(cnt+1)+"]:");
				
				for(int i=0; i<lotto.length; i++) {
					
					lotto[i]=new Random().nextInt(25)+1;
					//lotto[i]=(int)(Math.random()*45)+1;
					//�ߺ��� �񱳹�
					for(int j=0;j<i;j++) {
						if(lotto[i]==lotto[j]) {
							i--;
							break;
							
						}//if
						
					}//for
					
				}//for
				//------���--------
				for (int i=0;i<lotto.length;i++)
				System.out.print(lotto[i]+" ");
				
			
			
		}//while
		

		
	}

}
