package Chpater06;

public class Bus {
	
	//�������
	int busNumber;
	int passengerCount;
	int money;
	
	//������ �����ε�(int busnumber)
	public Bus(int busNumber) {
		this.busNumber=busNumber;
	}
	
	//�޼��� 
	public void take(int money) {//�°��� �� ��
		this.money+=money;//���� ����
		passengerCount++;//�°��� �� ����
	}
	
	public void showinfo() {
		System.out.println(busNumber+"�� ������ �°���"
	    +passengerCount+"���̰�, ������"+money+"�Դϴ�." );
		
	}
	
	
}
