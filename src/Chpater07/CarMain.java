package Chpater07;

public class CarMain {
	public static void main(System[]args) {
		//��ü(myCar) �����ϸ鼭 �ʱ�ȭ
		Car myCar=new Car("����",3000);
		//��������� �̿��Ͽ� ���� ����
		myCar.color="ȭ��Ʈ";
		
		//������� �̿��ؼ� ���
		System.out.println("color: "+myCar.color);
		System.out.println("cc"+myCar.cc);
		
		
		//�޼��� �̿��ؼ� ���
		System.out.println("color: "+myCar.getColor());
		System.out.println("cc"+myCar.cc);
		
		
	}
}
