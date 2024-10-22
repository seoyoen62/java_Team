package Chpater04;

public class ArrayTest07 {

	public static void main(String[] args) {
		
		char [] alpa=new char[26];//요소없음 즉 초기화 안되어있음
		char ch='A';
		/*
		for(int i=0;i<alpa.length;i++) {
			alpa[i]+=(ch+i); //alpa[i]=alpa[i]+(ch+i)
			
			alpa[i]=ch;
			ch++;//65++  ch=ch+1
			
			System.out.println(ch+i);
			System.out.println("("+alpa[i]+")"+" ");
			
		}//f
		*/
		
		for(int i=0;i<alpa.length;i++,ch++) {	
			alpa[i]=ch;
			System.out.println("("+alpa[i]+", "+(int)(alpa[i])+")");
			
			
		}//f
		
	}

}
