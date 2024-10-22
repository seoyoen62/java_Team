package Chpater05;

public class Example04 {
	
	
	public double calcilateAverage(int[] array) {//{5,10,15,20,25}
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		double avg=(double)sum/array.length;
		
		return avg;
	}


	public static void main(String[] args) {
		
		Example04 calculator=new Example04();// 힙
		
		int[] numbers= {5,10,15,20,25};//숫자를 넘버에 담고
		double average= calculator.calcilateAverage(numbers);//담겨서위로올라감
		System.out.println("배열의 평균:" +average);
	}
}
