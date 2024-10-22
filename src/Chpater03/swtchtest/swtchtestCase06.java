package Chpater03.swtchtest;

public class swtchtestCase06 {

	public static void main(String[] args) {
		
		int time = (int)(Math.random()*10)+9;  //9~18
		System.out.println("[현재시간:" +time+"시]");
		System.out.print("할 일:");
		
		switch (time) {
		case 9: {
			System.out.println("루키 산책하기");
			break;
		}
		case 10: {
			System.out.println("잠자기");
			break;
		}
		case 12: {
			System.out.println("점심먹기");
			break;
		}
		case 13: {
			System.out.println("공부하기");
			break;
		}
		case 19: {
			System.out.println("저녁먹기");
			break;
		}
		default:
			System.out.println("멍떄리기");
		}
	}

}
