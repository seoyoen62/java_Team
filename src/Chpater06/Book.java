package Chpater06;

public class Book {
	
	//������� (=�ʵ�)
	public String bookname;
	public String author;
	
	//������
	public Book() {
		
	}
	
	//�������� �����ε�
	public Book(String bookname, String author) {
		this.bookname = bookname;
		this.author = author;
	}
	//�޼��� gette set
	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	//����� �޼���
	public void showBookInfo() {
		System.out.println("å �̸�:"+bookname+"����"+author);
	}
	
}
