package Chpater02;

public class Example02 {

	public static void main(String[] args) {
		/*soldesk ������
		 * ��, ���, �������� Ű��� �ִµ� �Ϸ翡 ����Ǵ� ���� ���� 5��, 7��, 5�� �Դϴ�.
		 * ���������� �Ϸ翡 ����Ǵ� �� ������ ������ ����ϰ�,
		 * �ð���(24) ��ü ������ ��� ���� ������ ��� �Ͻÿ�.
		 * (��, ��հ��� ��� ������ Ÿ���� float)�� �����Ѵ�.
		 */
		
		int pear=5;
		int apple=7;
		int orange=5;
		
		System.out.println("�Ϸ� ����Ǵ� ������ ����:"+(pear+apple+orange));
		System.out.println("�Ϸ� ����Ǵ� ������ ����:"+((float)pear+apple+orange)/24);
		
		
		int total=pear+apple+orange;
		
		System.out.println("�Ϸ� ����Ǵ� ������ ����:"+total);
		
		float total1=pear+apple+orange/24f;
		
		System.out.println(total1);
		System.out.println((total1)/24);
		

	}

}
