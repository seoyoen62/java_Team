package Chpater03.swtchtest;

public class swtchtestCase06 {

	public static void main(String[] args) {
		
		int time = (int)(Math.random()*10)+9;  //9~18
		System.out.println("[����ð�:" +time+"��]");
		System.out.print("�� ��:");
		
		switch (time) {
		case 9: {
			System.out.println("��Ű ��å�ϱ�");
			break;
		}
		case 10: {
			System.out.println("���ڱ�");
			break;
		}
		case 12: {
			System.out.println("���ɸԱ�");
			break;
		}
		case 13: {
			System.out.println("�����ϱ�");
			break;
		}
		case 19: {
			System.out.println("����Ա�");
			break;
		}
		default:
			System.out.println("�ۋ�����");
		}
	}

}
