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
		
		Example04 calculator=new Example04();// ��
		
		int[] numbers= {5,10,15,20,25};//���ڸ� �ѹ��� ���
		double average= calculator.calcilateAverage(numbers);//��ܼ����οö�
		System.out.println("�迭�� ���:" +average);
	}
}
