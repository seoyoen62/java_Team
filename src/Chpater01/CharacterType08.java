package Chpater01;

public class CharacterType08 {

	public static void main(String[] args) {
		// Java���� char : 2byte(16bit) => �����ڵ�(UTF-16)
		//C,C++,C#���� Char : 1����Ʈ(8bit)
		
		char ch1= '��';
		char ch2= '\uD55C';
		
		char str1= 'A';
		String str2="Hello Java";
		String str3="W";
		String str4="Welcome to Java";
		
		System.out.println("ch1:"+ch1);
		System.out.println("ch2:"+ch2);
		
		System.out.println("str1:"+str1);
		System.out.println("str1:"+str2);
		System.out.println("str1:"+str3);
		System.out.println("str1:"+str4);
	}

}
