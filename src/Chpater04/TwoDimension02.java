package Chpater04;

import javax.swing.JOptionPane;

public class TwoDimension02 {

	public static void main(String[] args) {
		
		int javaScore[][]=new int[2][3];
		
		for (int i = 0; i < javaScore.length; i++) {//행
			for (int j = 0; j < javaScore[i].length; j++) {//열
				// 입력
				int jumsu = Integer.parseInt(JOptionPane.showInputDialog("JAVA 점수"));
				// 입력받은 점수를 대입연산을 이용하여 javaScore방에 저장
				javaScore[i][j] = jumsu;
				System.out.println("JavaScore[" + i + "][" + j + "]:" + javaScore[i][j]);
				//-------------------------------------------------------------
			/*	score = JOptionPane.showInputDialog("점수");
				javaScore[i][j] += Integer.parseInt(score);
				System.out.println("javaScore[%d][%d]:%s", i,j,score);*/
		
			}
	}

}
}