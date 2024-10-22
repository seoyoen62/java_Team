package Chpater03.fortest;

public class ForTest04 {

	public static void main(String[] args) {
		System.out.println("===0부터 100까지의 수중 홀수의 합을 출력==");
		
		int num;
		int total = 0;
		
		for(num=1; num<100;num++) {
			if(num%2==0) {
				continue; //그냥 가세요(무시)
			}
			System.out.println(num+" ");
			total+=num;
		}
		System.out.println();
		System.out.println("0~100까지의 홀수의 합:"+total);
		
	/*	int num;
		int total = 0;
		
		for(num=1; num<100;num++) {
			total+=num/2;
		}
		System.out.println();
		System.out.println("1~100까지의홀수의 합:"+total);*/
		
		/*int num;
		int total = 0;
		
		for(num=0; num<=100;num++) {
			if(num%2==1) {
				total+=num;
			}
		}*/
		
		
		
		
		
		
		
		
		
		
		
	}

}
