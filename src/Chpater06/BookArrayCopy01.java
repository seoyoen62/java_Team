package Chpater06;

public class BookArrayCopy01 {

	public static void main(String[] args) {
		//���� ����
		Book[] bookArray1=new Book[3];
		Book[] bookArray2=new Book[3];
		
		bookArray1[0]=new Book("���̾�","�츣�� �켼");
		bookArray1[1]=new Book("�鼳����","�׸�����");
		bookArray1[2]=new Book("�����Ӹ���","����������");
		
		System.out.println("=========bookArray1����============");
		for(int i=0;i<bookArray1.length;i++) {
			bookArray1[i].showBookInfo();
		}
		//����
		//������ �迭, ������ ù ��ġ, ���迭, �ٿ����� ù ��ġ, ������ ��� ����
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		for(int i=0;i<bookArray1.length;i++) {
			bookArray2[i].showBookInfo();}
			//===========================================
			System.out.println();
			bookArray1[0].setBookname("����");
			bookArray1[0].setBookname("�ڿϼ�");
			System.out.println("=========bookArray1����============");
			for(int i=0;i<bookArray1.length;i++) {
				bookArray1[i].showBookInfo();
			}
			System.out.println("=========bookArray1����============");
			for(int i=0;i<bookArray2.length;i++) {
				bookArray1[i].showBookInfo();
			}
		
	}

}
