package Chpater06;

public class TakeTrans {

	public static void main(String[] args) {
		
		//�л� 2�� ����(studentJaames,studentTom)
		StdInfo studentJames = new StdInfo("James",15000);
		StdInfo studentTom = new StdInfo("Tom",12000);
		
		//����Ÿ��(100)
		Bus bus100=new Bus(100);
		studentJames.takeBus(bus100);//13600
		//James ��������
		studentJames.showinfo();
		bus100.showinfo();
		
		//����Ÿ��(999)
		Bus bus999=new Bus(999);
		studentTom.takeBus(bus999);//10600
		//Tom ��������
		studentTom.showinfo();
		bus999.showinfo();
//-------------------------------------------
		//����ö Ÿ��(1ȣ��)
		Subway subway1=new Subway("1ȣ��");//String�̴ϱ� 1�� �ֵ���ǥ�ؾ���
		studentJames.takesubway(subway1);
		studentJames.showinfo();
		subway1.showinfo();
		
		Subway subwayOrange=new Subway("3ȣ��");
		studentTom.takesubway(subwayOrange);
		studentTom.showinfo();
		subwayOrange.showinfo();
		
		
	}

}
