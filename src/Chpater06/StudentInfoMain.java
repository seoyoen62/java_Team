package Chpater06;

public class StudentInfoMain {

	public static void main(String[] args) {
		//멤버변수 초기화(1004,"백설",1,"일산")
		
		StudentInfo dog = new StudentInfo(1004,"백설",1,"일산");
		System.out.println(dog.address);
		System.out.println(dog.getStudentName());
		
		
		//기본생성자로 객체 생성
		StudentInfo doglee = new StudentInfo();
		//직관적인 초기화
		doglee.address="종로구";
		System.out.println(doglee.address);
		
		//기본생성자로 객체 생성
		StudentInfo dogkim = new StudentInfo();
		//getters and setters
		dogkim.setStudentName("최재현");
		String sname=dogkim.getStudentName();
		System.out.println(sname);
		
		
	}

}
