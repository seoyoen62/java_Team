package Chpater06;

public class BuyCoffee {

	public static void main(String[] args) {
		//��2�� ����(kim 12000, park 10000)
		Customer kim=new Customer("kim", 12000);
		Customer park=new Customer("park", 12000);
		
		//ī�� ����(Ű�䰴ü�̸�-> ���̳��� Ŀ��)
		Cafe cafeA=new Cafe("���̳��� Ŀ��");
		
		//ī�� �湮(���̳��� Ŀ��->kim 4000/park 4500)
		kim.visitCafe(cafeA, 4000);
		park.visitCafe(cafeA, 4500);
		
		//ī������
		cafeA.showInfo();
		
		//������ ����
		kim.showInfo();
		park.showInfo();
	}

}
