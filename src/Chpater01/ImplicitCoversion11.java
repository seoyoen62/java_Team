package Chpater01;

public class ImplicitCoversion11 {

	public static void main(String[] args) {
		// ������ ����ȯ:���� �޸𸮿��� ū �޸𸮷� �ڿ������� ����ȯ(byte->int)
		byte bNum=10;
		int iNum=bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2=10;
		
		//byte bNum2=iNium;error

		// ������ ����ȯ:�� ������ ���� ����ȯ(int->float)
		int iNum3=30;
		float fNum=iNum3;
		
		System.out.println(iNum3);
		System.out.println(fNum);
		
		float fNum2=30.5f;
		//int iNum2=iNum2;
		System.out.println(fNum2);//error
	}

}
