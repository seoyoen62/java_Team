package Chpater04;

public class ArrayTest04 {

	public static void main(String[] args) {
		double[] data=new double[5];
		
		//3개만 대입연산
		
		data[0]=10.0;
		data[1]=20.0;
		data[2]=30.0;
		
		double total=1.0;
		for(int i=0;i<3;i++) {
			System.out.println(data[i]);
			total*=data[i];
		}
		
		
	}

}
