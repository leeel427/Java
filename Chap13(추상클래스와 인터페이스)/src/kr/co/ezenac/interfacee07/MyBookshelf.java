package kr.co.ezenac.interfacee07;

public class MyBookshelf extends Bookshelf implements Queue{

	public void enQueue(String title) {
		bookshelf.add(title);
	}

	public String deQueue() {
		
		return bookshelf.remove(0);
	}
	
	

}
