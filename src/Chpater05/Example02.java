package Chpater05;

public class Example02 {
	
	//�� ������ �Է¹޾Ƽ�(=�Ű�����) �� ���� ����ϴ� �޼ҵ带 ����
	
	//��ȯ���� �ִ� �޼���
	public static int sum(int a, int b) {
		return a+b;
	}
	
	//��ȯ���� ����
	public static void sum1(int a, int b) {
		int sum1=a+b;
		System.out.println(sum1);
		
	}//

	public static void main(String[] args) {
		
		int num1=10;
		int num2=20;
		
		//��ȯ���� �ִ� �޼���
		int a =sum(num1,num2);
		System.out.println("��ȯ�� ���"+a);
		
		//��ȯ���� ����
		sum1(num1,num2);
		
		}//m
}
