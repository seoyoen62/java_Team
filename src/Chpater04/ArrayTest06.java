package Chpater04;

import javax.swing.JOptionPane;

public class ArrayTest06 {

	public static void main(String[] args) {
		
		String str[]= {"홍길동","김유신","장길산","이순신"};
		String res="";
		
		for(int i=0;i<str.length;i++) {
			res+=str[i]+"\n";  //res=res+str[i]
		}
		System.out.println(res);
		JOptionPane.showMessageDialog(null, "[영웅들]\n"+res);//메시지박스
		
	}

}
