package Chpater04;

public class Example02 {

	public static void main(String[] args) {
		
		// for���� �̿��Ͽ� ���� �迭�� ������ �ٴ����� ������ ����� ���ϰ� ��ü ������ ��� ���.
				int[][] array= { {95,86}, {83,92,96}, {78,83,93,87,88} };//3��x��
				
				double avg=0;//�� ���� ���
				double totalavg=0;//��ü ����� ���
				int total=0;//������ ��
				int alltotal=0;//��ü �迭�� ��
				int count=0;//��ü ����� ����
				
				//array.length:3
				//for���� �̿� -> �� ���� �����ͼ�/ ������ ���� �о /sum�� �����ϰ�(count++) ��ձ��� ���Ͽ� ���
				
				for(int i=0;i<array.length;i++) {//�� ���� �����ͼ�
					for(int j=0; j<array[i].length;j++) {//������ ���� �о
						total+=array[i][j];//array[1][0],
						count++;//��ü ��տ� ���� ī��Ʈ
					}
					
					alltotal+=total;
					avg=(double)total/array[i].length;
					System.out.println((i+1)+"���� ���:"+avg);
					System.out.println("------------------------");
					total=0; //���� ���� ����� ���� �����Ⱚ ����
				}
				System.out.println("��ü ���� ��:"+alltotal);
				totalavg=(double)alltotal/count;
				System.out.println("��ü ����������:"+totalavg);
	}

}
