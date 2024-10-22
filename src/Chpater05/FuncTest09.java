package Chpater05;

class MyObject{
	//멤버변수
	int value;
	
	//생성자
	public MyObject (int value) {
		this.value=value;	
	}
}//c
public class FuncTest09 {
	
	//멤버변수
	int value;
	
	//생성자
	public FuncTest09(int value) {
		this.value = value;
	}
	
	public static void main(String[] args) {
		//MyObject obj
		MyObject obj=new MyObject(10);
		
		System.out.println("Before:"+obj.value);//10
		changeValue(obj);//Call by Value(값으로 전달되는 방식)
		System.out.println("After:"+obj.value);//20
	}//m
	//참조형 메서드
	public static void changeValue(MyObject object) {
		object.value=20;
				
	}
		
		
}//c


