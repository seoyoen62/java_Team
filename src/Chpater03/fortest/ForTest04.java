package Chpater03.fortest;

public class ForTest04 {

	public static void main(String[] args) {
		System.out.println("===0���� 100������ ���� Ȧ���� ���� ���==");
		
		int num;
		int total = 0;
		
		for(num=1; num<100;num++) {
			if(num%2==0) {
				continue; //�׳� ������(����)
			}
			System.out.println(num+" ");
			total+=num;
		}
		System.out.println();
		System.out.println("0~100������ Ȧ���� ��:"+total);
		
	/*	int num;
		int total = 0;
		
		for(num=1; num<100;num++) {
			total+=num/2;
		}
		System.out.println();
		System.out.println("1~100������Ȧ���� ��:"+total);*/
		
		/*int num;
		int total = 0;
		
		for(num=0; num<=100;num++) {
			if(num%2==1) {
				total+=num;
			}
		}*/
		
		
		
		
		
		
		
		
		
		
		
	}

}
