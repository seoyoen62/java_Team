package Chpater06;

public class Student {
	
	//�������=�ʵ�
	public static final int studentID=1000;
	public String StudentName;
	int grade;
	String address;
	
	//������
	public Student() {
		
	}
	
	//������ �����ε�
	public Student(String studentName, String address) {
		super();
		StudentName = studentName;
		this.address = address;
	}

	//�޼���
	
	public String getStudentName() {//get���� ���� �޴°�
		return StudentName;
	}
	
	public void setStudentName(String studentName) {//set���� �Է��ϴ°�
		StudentName = studentName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	//����� �޼���
	public void showStudentInFo() {
		System.out.println(StudentName+","+address);
	}

}

