package Chpater03.fortest;

public class ForTest06 {

	public static void main(String[] args) {
		// 1�������� 100������ �� �߿��� 3�� ����� ã�� ���� ����ϼ���
		
		int sum = 0;
		
		for (int i=1; i<=100; i++) {
			if(i%3==0) {
				sum+=i;
			}
		}
		
		System.out.println("3�� ����� ��:"+sum);
	}

}
