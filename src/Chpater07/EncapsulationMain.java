package Chpater07;

import javax.swing.JOptionPane;

public class EncapsulationMain {

	public static void main(String[] args) {
		int side;
		int height;
		int Area;
		
		side=Integer.parseInt(JOptionPane.showInputDialog("�غ�"));
		height=Integer.parseInt(JOptionPane.showInputDialog("����"));
		
		//��ü����
		Encapsulation enc=new Encapsulation();
		
		Area=enc.Cal_Area(side,height);
		System.out.println("�簢���� ����: "+Area+"�Դϴ�.");
		
		
		
		
		
	}

}
