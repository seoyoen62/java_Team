package Chpater03.whiletest;

import java.util.Scanner;

public class whiletest06 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int num, cnt=0, sum=0;
		double avg;
		
		while(true) {
			System.out.print("���ڸ� �Է��ϼ���:");
			num=scan.nextInt();
			
			if(num==0) {
				break;
			}
			
			cnt++; //���ڰ� � �ԷµǾ����� üũ
			sum+=num; //sum=sum+num ������
			
		}//w
		avg=(double)sum/cnt;
		
		System.out.print("�Էµ� ������ ����:"+cnt+"\n");
		System.out.print("�Էµ� ������ �հ�:"+sum+"\n");
		System.out.print("�Էµ� ������ ���:"+Math.round(avg*1000.0)/1000+"\n");
		System.out.printf("�Էµ� ������ ���: %.3f",avg);
	}//class

}//main
