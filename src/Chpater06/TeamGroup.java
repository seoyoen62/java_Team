package Chpater06;

public class TeamGroup {
	//�������
	private TeamMember[] member=new TeamMember[5];
	
	//�⺻������
	
	//�ʱ�ȭ �޼���
	public void init() {
		member[0]=new TeamMember("�����","���л�");//�����ε� ������
		member[1]=new TeamMember("������","���л�");//�����ε� ������
		member[2]=new TeamMember("�����","���л�");//�����ε� ������
		member[3]=new TeamMember("������","���л�");//�����ε� ������
		member[4]=new TeamMember("���ڼ�","���л�");//�����ε� ������
	}
	//��� �޼���
	public void Disp() {
		
		for(int i=0; i<member.length; i++) {
			System.out.print("����: "+(member[i].getName()));//get ��������
			System.out.println(", ����: "+(member[i].getGender()));
		}
		
	}//Disp
	
}
