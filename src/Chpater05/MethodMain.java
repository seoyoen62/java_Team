package Chpater05;

public class MethodMain {

	public static void main(String[] args) {
		
		Method bread=new Method();//new 객체를 만드는녀석,힙 메모리에 참조하게 해주는 녀석
		
		bread.makeBread();
		System.out.println("---------------");
		bread.order();//void makeBread(int cnt),void makeBread(int cnt, String str)
	}

}
