package Chpater06;

public class StudentInfoMain {

	public static void main(String[] args) {
		//������� �ʱ�ȭ(1004,"�鼳",1,"�ϻ�")
		
		StudentInfo dog = new StudentInfo(1004,"�鼳",1,"�ϻ�");
		System.out.println(dog.address);
		System.out.println(dog.getStudentName());
		
		
		//�⺻�����ڷ� ��ü ����
		StudentInfo doglee = new StudentInfo();
		//�������� �ʱ�ȭ
		doglee.address="���α�";
		System.out.println(doglee.address);
		
		//�⺻�����ڷ� ��ü ����
		StudentInfo dogkim = new StudentInfo();
		//getters and setters
		dogkim.setStudentName("������");
		String sname=dogkim.getStudentName();
		System.out.println(sname);
		
		
	}

}
