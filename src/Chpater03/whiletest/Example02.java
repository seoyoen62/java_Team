package Chpater03.whiletest;

public class Example02 {

	public static void main(String[] args) {
		// ���丮�� �˰���
		/*
			5! -> 5x4x3x2x1 => n! -> n*(n-1)*(n-2)*(n-3)*(n-4)
		*/
		
		int number=5;
		int factorial=1;//factorial=factorial*number => factorial*=number
		
		//���ڰ�(number) 0���ϰ� �ƴҋ����� �ݺ��ϴ� ���丮��
		while(number>0) {
			factorial*=number;
			number--;
		}//w
		System.out.println("���丮�� ���:"+factorial);
	}//m

}//c
