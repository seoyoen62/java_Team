package Chpater04;

public class ArgsTest02 {

	public static void main(String[] args) {
		
		//�迭�� �⺻ ����
		int a[]=new int[5];
		
		//�迭�� �⺻ ���� 2 (���̾�)
		int b[];
		//......
		b=new int[5];
		
		//main���� �ִ� �Ű����� Ȱ��
		args=new String[2];
		args[0]="10"; //[0]:÷��, �ε���/"0" ���
		args[1]="20";
		String sum = args[0]+args[1];
		System.out.println("���ڿ�����"+sum);
		System.out.println();
		String[]str;
		str=new String[10];
		
		int aVal;
		int bVal;
		
		
		if(args.length==2) {
		aVal=Integer.parseInt(args[0]);//10
		bVal=Integer.parseInt(args[1]);//20
		}else {
			aVal=0;
			bVal=0;
		}
		System.out.println("---------------------");
		int total = aVal+bVal;
		System.out.println("�������"+total);
		
	}

}
