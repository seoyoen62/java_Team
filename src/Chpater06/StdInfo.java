package Chpater06;

public class StdInfo {
	//�������=�ʵ�
	public String studentName;
	public int grade;
	public int money;
	
	//������ �����ε�(studentName,money)
	public StdInfo(String studentName,int money) {
		this.studentName=studentName;
		this.money=money;
		
	}
	//����
	public void takeBus(Bus bus) {
		bus.take(1400);//����ȸ�� ���԰� �°� ����
		this.money-= 1400;//�л�����
	}
	
	//����ö
	public void takesubway(Subway subway) {
		subway.take(1800);
		this.money-=1800;
	}
	//�ܾ�
	public void showinfo() {
		System.out.println(studentName+"���� ���� �ܾ���: "
	     +money+"�� �Դϴ�.");
		
	}
	
	
	
	
}
