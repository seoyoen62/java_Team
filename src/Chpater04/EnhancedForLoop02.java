package Chpater04;

public class EnhancedForLoop02 {

	public static void main(String[] args) {
		int number[]= {10,20,30,40,50};
		
		for(int num:number) {
			System.out.println(num+" ");
		}
		
		System.out.println("==================================");
		
		int num[]= {5,10,15,20,25};
		int sum=0;
		
		for(int n:num) {
			System.out.println(n+" ");
			sum+=n;
		}
		System.out.println("�հ�:"+sum);
		
	}

}
