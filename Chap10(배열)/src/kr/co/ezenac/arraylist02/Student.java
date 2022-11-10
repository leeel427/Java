package kr.co.ezenac.arraylist02;

import java.util.ArrayList;

public class Student {

	//private int stduentId;
	private String stduentName;
	
	ArrayList<Book> bookList;
	
	
	public Student(/*int stduentId,*/String stduentName) {
	//	super();
		//this.stduentId = stduentId;
		this.stduentName = stduentName;
	
		bookList = new ArrayList<>();
	}

	public void addBook(String title,String author) {
		Book book = new Book();

		book.setTitle(title);
		book.setAuthor(author);
		bookList.add(book);
	}
	public void showInfo() {
		System.out.println(this.stduentName+ " 학생이 읽은 책은 : ");
		
		for (Book book : bookList) {
			System.out.println(book.getTitle() + " 입니다.");
		}
	}
	
	
	
}
