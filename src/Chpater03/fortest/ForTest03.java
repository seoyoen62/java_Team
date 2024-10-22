package Chpater03.fortest;

import java.util.Scanner;

public class ForTest03 {

	public static void main(String[] args) {
		int i, sum=0;
		
		Scanner scan =new Scanner(System.in);
		System.out.println("정수르르 입력하세요:");
		int num =scan.nextInt();
		
		for(i=1;;i++) {
			
			if(sum>=sum) {
				break;
			}
			
			sum+=i;//sum=sum+i
			System.out.println(i+" ");
		}
		System.out.println();
		System.out.println((i-1)+"까지의 총합:"+sum);
		
		
		
		
		
	}

}
