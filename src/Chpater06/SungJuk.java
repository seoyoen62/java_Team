package Chpater06;

import javax.swing.JOptionPane;

public class SungJuk {
	
	//필드 또는 멤버변수
	private String std_num;//private클래스 내에서만 사용가능
	private String std_name;
	private int java, oracle,spring;

	//디폴트 생성자
	
	//메서드
	public void Sum() {
		int total=java+oracle+spring;
		System.out.println("총합계:"+total);
	}
	
	public void Avg() {
		double avg=(double)(java+ oracle+spring)/3;
		System.out.println("평균:"+avg);
	}
	

	public static void main(String[] args) {
		
		//SungJuk(rec)객체생성
		SungJuk rec=new SungJuk();
		
		rec.std_num=JOptionPane.showInputDialog("학번");
		rec.std_num=JOptionPane.showInputDialog("이름");
		
		rec.java=Integer.parseInt(JOptionPane.showInputDialog("자바점수"));
		rec.oracle=Integer.parseInt(JOptionPane.showInputDialog("오라클점수"));
		rec.spring=Integer.parseInt(JOptionPane.showInputDialog("스프링점수"));
		
		
		
		System.out.println("학번-"+rec.std_num+"성명"+rec.std_name+"님의 성적입니다.");
		System.out.println("--------------------------------------------------");
		rec.Sum();
		rec.Avg();
		
	}

}
