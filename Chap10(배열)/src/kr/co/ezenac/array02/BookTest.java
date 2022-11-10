package kr.co.ezenac.array02;

public class BookTest {

	public static void main(String[] args) {
		
		Book[] book = new Book[5];
		
		book[0] = new Book("혼자 공부하는 컴퓨터 구조", "강민철");
		book[1] = new Book("혼자 공부하는 컴퓨터 구조2", "강민철");
		book[2] = new Book("혼자 공부하는 컴퓨터 구조3", "강민철");
		book[3] = new Book("혼자 공부하는 컴퓨터 구조4", "강민철");
		book[4] = new Book("혼자 공부하는 컴퓨터 구조5", "강민철");

		for (int i=0; i<book.length; i++) {
			//System.out.println(book[i]);
			book[i].showInfo();
			}
		
		
	}

}
