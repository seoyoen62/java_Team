package Chpater04;

public class ArrayTest08 {

	public static void main(String[] args) {

	/*for �̿�
	 * score���� ���=>score[0]:98
	 * sum�����濡 ���� ����
	 * avg�����濡 ������ ��� ���(�� �Ǽ�Ÿ��)
	 */
		
		int score[]= {98,90,87};
		int sum=0;
		
		for(int i=0;i<score.length;i++) {
			System.out.println(score[i]);
			sum+=score[i];
		}
		
		//sum����
		System.out.println("����:"+sum);
		//avg��� ������ ��� (�� avg�� �Ǽ�)
		double avg=sum/(double)(score.length);
		System.out.println("���:"+avg);
		System.out.println(Math.round(avg));

	}

}
