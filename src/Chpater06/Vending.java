package Chpater06;

public class Vending {
	//�������
	private Can[] can=new Can[5];
	private int money;
	
	//�⺻ ������
	
	//�޼ҵ�
	public void init() {
		can[0]=new Can("ȯŸ",1000);
		can[1]=new Can("���̴�",1200);
		can[2]=new Can("�ݶ�",1300);
		can[3]=new Can("��Ű��",1400);
		can[4]=new Can("�����",1500);
		
	}
	// ��� ������ ���Ḹ �����ִ� �޼���
	public void showCans(int m) {
		money=m;
		for(int i=0; i<can.length;i++) {
			if(can[i].getPrice()<=money) {
				System.out.println(can[i].getCanName()
						+"-"+can[i].getPrice()+"��");
			}
		}//for
	}//show
	public void outCan(String name) {
		for(int i =0; i<can.length;i++) {
			if(name.equals(can[i].getCanName())) {
				System.out.println("��û�Ͻ� "+can[i].getCanName()+"�� ���� �ϼ̽��ϴ�.");
				System.out.println("�ܾ� "+(money-can[i].getPrice()+"�� �Դϴ�."));
			}
		}
	}
	
	
	
	
	
}
