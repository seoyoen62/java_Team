package Chpater02;

public class ArithTest01 {

	public static void main(String[] args) {
		
		//������ ���
		int mathScore=96;
		int engScore=87;
		
		//����
		System.out.println("����:"+ (mathScore+engScore));
		//���
		System.out.println("���:"+(mathScore+engScore)/2);
		System.out.println("---------------------------------");
		
		System.out.println("��� : "+(mathScore+engScore)/2f);
		System.out.println("��� : "+((mathScore+engScore)/2.0));
		System.out.println("---------------------------------");
		
		double total=mathScore+engScore;
		System.out.println(total);
		
		double average = total/2;
		System.out.println("���:"+average);
		
	}

}
