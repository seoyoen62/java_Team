package Chpater04;

public class TwoDimension01 {

	public static void main(String[] args) {
		//�������迭
		int arr[][]=new int [2][3];
		int n=0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0;j<arr[i].length;j++) {
				n++;//0
				System.out.print(arr[i][j]=n);
			}//f
			System.out.println();
		}//f
		
		System.out.println("=====================");
		System.out.println(arr.length);//[��][��] ��=>2
		System.out.println(arr[0].length);//[��][��] ��=>3
		System.out.println("=====================");
		
		int arr1[][]= {{1,2,3},{4,5,6}};
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+" ");
			}//f
			System.out.println();
		}//f
		
		
	}

}
