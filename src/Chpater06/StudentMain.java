package Chpater06;

public class StudentMain {

	public static void main(String[] args) {
		//����Ʈ �����ڷ� ��ü��(student1) �����Ͽ� �̸��� �ּҸ� �Է�
		Student student1=new Student(); //Student()->������
			student1.StudentName = "�鼳";
			student1.address = "�ϻ�";
			student1.showStudentInFo();
			
			
			System.out.println();
		//�����ڸ� ���ؼ� �ʱ�ȭ showStudentInfo()�� ���
			Student student_2 = new Student("�ֹ鼳","�ϻ�");
			student_2.showStudentInFo();
			
		//����Ʈ �����ڷ� ��ü��(student1) �����Ͽ� getters and setters
			Student student3=new Student();
			student3.setStudentName("�ֵ���ũ");
			student3.setAddress("���α�");
			student3.showStudentInFo();
			
			System.out.println(student3.getStudentName());
			System.out.println(student3.getAddress());
			
			
			
			
			
		
	}

}
