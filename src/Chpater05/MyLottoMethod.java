package Chpater05;

import javax.swing.JOptionPane;

public class MyLottoMethod {

	public static void main(String[] args) {
		
		
		int number = Integer.parseInt(JOptionPane.showInputDialog("���ϴ� �ζ� ���� Ƚ���� �Է��ϼ���."));
		
		int cnt = 0;
		System.out.println("====�̹��� �ζ� �����ȣ====");
		while(number>cnt) {
			System.out.println("["+(cnt+1)+"]: " );
			int[] lotto=new int[6];
			int index = 0;
			//�ζǹ�ȣ 6�� ���
			while(index < 6) {
				int num=(int)(Math.random()*45)+1;//0���� �����ϴϱ� 1 ���ؼ� ����
				//int=contains(lotto,num)->false
				if(!contains(lotto,num)) {//�ߺ�üũ 
					lotto[index++]=num;
					
					
				}//if
			}//w
			//�ζ� 6�� ���
			for(int num:lotto) {
				System.out.print(num+" ");
			}
			System.out.println();
			cnt++;//�ټ�
		}//w
	}//m
	//----------------------------------------------------------------------------------------------
	//�ߺ�üũ���ִ� �޼ҵ�
	public static boolean contains(int[]arr,int num) {//int[]; lotto=new int[];,int num
		
		for(int i:arr) {
			if(i==num) {//�迭�濡 �ִ� ����==��� ���� ����
				return true;//�ߺ� ���� �ִ�
			}//if
		}//f
			return false;//�ߺ����� ����
	}//contains
}
