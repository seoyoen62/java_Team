package Chpater06;

public class Student {
	
	//멤버변수=필드
	public static final int studentID=1000;
	public String StudentName;
	int grade;
	String address;
	
	//생성자
	public Student() {
		
	}
	
	//생성자 오버로딩
	public Student(String studentName, String address) {
		super();
		StudentName = studentName;
		this.address = address;
	}

	//메서드
	
	public String getStudentName() {//get값을 리턴 받는거
		return StudentName;
	}
	
	public void setStudentName(String studentName) {//set값을 입력하는거
		StudentName = studentName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	//사용자 메서드
	public void showStudentInFo() {
		System.out.println(StudentName+","+address);
	}

}

