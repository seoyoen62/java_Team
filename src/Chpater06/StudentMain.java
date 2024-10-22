package Chpater06;

public class StudentMain {

	public static void main(String[] args) {
		//디폴트 생성자로 객체를(student1) 생성하여 이름과 주소를 입력
		Student student1=new Student(); //Student()->생성자
			student1.StudentName = "백설";
			student1.address = "일산";
			student1.showStudentInFo();
			
			
			System.out.println();
		//생성자를 통해서 초기화 showStudentInfo()로 출력
			Student student_2 = new Student("최백설","일산");
			student_2.showStudentInFo();
			
		//디폴트 생성자로 객체를(student1) 생성하여 getters and setters
			Student student3=new Student();
			student3.setStudentName("솔데스크");
			student3.setAddress("종로구");
			student3.showStudentInFo();
			
			System.out.println(student3.getStudentName());
			System.out.println(student3.getAddress());
			
			
			
			
			
		
	}

}
