package Chpater03.fortest;

public class ForTest01 {

	public static void main(String[] args) {
		// 1~10������ ��
		
		int sum=1;
		
		//sum=sum+2;
		sum+=2;
		sum+=3;
		sum+=4;
		sum+=5;
		sum+=6;
		sum+=7;
		sum+=8;
		sum+=9;
		sum+=10;
		
		System.out.println(sum);
		
		int i;
		System.out.println("1���� 10 ������ �� ���");
		
		for(i=0;i<10;i++) {
			System.out.println((i+1)+" ");
			
		}
		
		int k;
		for(k=0;k<10;++k) {
			System.out.println((k+1)+" ");
			
			
		}
		
		/*System.out.println("--------------------------------------");
		
		int j;
		int hap=0;
		
		for(j=1; j<=10;j++) {
			hap+=j; //hap=hap+j
			System.out.println("current j:"+j+", hap: "+hap);
			
		}
	
		System.out.println("1���� 10������ ��: "+ hap);*/
		
		int j;
		int hap=0;
		
		for(j=1; j<=10;++j) {
			hap=++j; //hap=hap+j
			System.out.println("current j:"+j+", hap: "+hap);
			
		}
	
		System.out.println("1���� 10������ ��: "+ hap);
		
		
		
		
		
	}

}
