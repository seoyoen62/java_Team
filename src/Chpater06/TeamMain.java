package Chpater06;

public class TeamMain {

	public static void main(String[] args) {
			
		TeamGroup team=new TeamGroup();
		
		team.init();//���� ���� �Է� 
		team.Disp();//���
		System.out.println();
		TeamMember t=new TeamMember();
		t.setName("������");
		System.out.println("�����̸�: "+t.getName());
		t.setmPhone("010-1234-1234");
		System.out.println("���� ��ȭ��ȣ: "+t.getmPhone());
		t.setName("������");
		System.out.println("������ �̸�: " +t.getsName());
		
		
	}

}
