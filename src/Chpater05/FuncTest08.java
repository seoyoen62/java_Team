package Chpater05;

public class FuncTest08 {

	public static void main(String[] args) {
		
		
		int num=10;
		System.out.println("Before:"+num);
		changeValue(num);//Call by Value(������ ���޵Ǵ� ���)
		System.out.println("After:"+num);
	}//m
		public static void changeValue(int value) {
			value=20;//value���� num�̶�� �Ű������� ���纻�̹Ƿ� �������� �������
		
		
		
	}

}
