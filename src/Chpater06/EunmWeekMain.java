package Chpater06;

import java.util.Calendar;

public class EunmWeekMain {

	public static void main(String[] args) {
		
		
		Week today=null;
		Calendar cal=Calendar.getInstance();//�ѱ��� ���� ����
		int week=cal.get(Calendar.DAY_OF_WEEK);//1~7
		
		switch (week) {
		case 1: {
			today=Week.MONDAY;
			break;
		}
		case 2: {
			today=Week.TUESDAY;
			break;
			}
		case 3: {
			today=Week.WEDNESDAY;
			break;
		}
		case 4: {
			today=Week.THURSDAY;
			break;
		}
		case 5: {
			today=Week.FRIDAY;
			break;
		}
		case 6: {
			today=Week.SATURDAY;
			break;
		}
		case 7: {
			today=Week.SUNDAY;
			break;
		}
		}//s
		System.out.println("������ ����: "+today);
		
		if(today==Week.SATURDAY) {
			System.out.println("��Ű�� ���");
		}else {
			System.out.println("��ó�� ����");
		}
		
	}

}
