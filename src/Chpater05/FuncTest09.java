package Chpater05;

class MyObject{
	//�������
	int value;
	
	//������
	public MyObject (int value) {
		this.value=value;	
	}
}//c
public class FuncTest09 {
	
	//�������
	int value;
	
	//������
	public FuncTest09(int value) {
		this.value = value;
	}
	
	public static void main(String[] args) {
		//MyObject obj
		MyObject obj=new MyObject(10);
		
		System.out.println("Before:"+obj.value);//10
		changeValue(obj);//Call by Value(������ ���޵Ǵ� ���)
		System.out.println("After:"+obj.value);//20
	}//m
	//������ �޼���
	public static void changeValue(MyObject object) {
		object.value=20;
				
	}
		
		
}//c


