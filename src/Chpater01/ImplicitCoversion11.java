package Chpater01;

public class ImplicitCoversion11 {

	public static void main(String[] args) {
		// 묵시적 형변환:작은 메모리에서 큰 메모리로 자연스럽게 형변환(byte->int)
		byte bNum=10;
		int iNum=bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2=10;
		
		//byte bNum2=iNium;error

		// 묵시적 형변환:더 정밀한 수로 형변환(int->float)
		int iNum3=30;
		float fNum=iNum3;
		
		System.out.println(iNum3);
		System.out.println(fNum);
		
		float fNum2=30.5f;
		//int iNum2=iNum2;
		System.out.println(fNum2);//error
	}

}
