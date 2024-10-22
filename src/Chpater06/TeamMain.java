package Chpater06;

public class TeamMain {

	public static void main(String[] args) {
			
		TeamGroup team=new TeamGroup();
		
		team.init();//팀원 정보 입력 
		team.Disp();//출력
		System.out.println();
		TeamMember t=new TeamMember();
		t.setName("최재현");
		System.out.println("팀장이름: "+t.getName());
		t.setmPhone("010-1234-1234");
		System.out.println("팀장 전화번호: "+t.getmPhone());
		t.setName("허정욱");
		System.out.println("부팀장 이름: " +t.getsName());
		
		
	}

}
