package Chpater01;

public class BinarTest02 {

	public static void main(String[] args) {
		//�Ǿ��� �ڵ尡 0�̸� -> ���, 1�̸� -> ����
		int num1=0B00000000000000000000000000000101; //5
		//�������� ����ϸ� 429467290���� �����̹Ƿ� 1�� ������ ���
		//1�� ���� ����: 0->1 / 1->0
		//0B00000000000000000000000000000101 +1 -> 
		//0B00000000000000000000000000000110=> 6
		int num2=0B11111111111111111111111111111010;//1�Ǻ����� ��� -> -6
		int num3=0B11111111111111111111111111111011;//2�Ǻ���  -> -5
		
		System.out.println("num1 :"+num1);
		System.out.println("num1�� 1�� ���� :"+num2);
		System.out.println("num1�� 2�� ���� :"+num3);
		System.out.println("num1+num3 : "+(num1+num3));
	}

}
