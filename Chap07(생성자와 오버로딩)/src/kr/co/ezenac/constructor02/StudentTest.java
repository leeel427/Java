package kr.co.ezenac.constructor02;

public class StudentTest {

	public static void main(String[] args) {
		// 기본 생성자 호출
		Student student = new Student();
	//	System.out.println(student.getage());
		System.out.println(student.toString());
		
		System.out.println();
		
		// 매개변수가 있는 생성자 호출
		Student student2 = new Student("이순신", 30);
		System.out.println(student2.toString());
		
		System.out.println();
		
		// 매개변수가 String형 하나 있는 생성자 호출
		Student student3 = new Student("신사임당");
		System.out.println(student3/*.toString()*/);
		
		System.out.println();
		
		// 매개변수가 int형 하나 있는 생성자 호출
		Student student4 = new Student(40);
		System.out.println(student4/*.toString()*/);
		
	}

}
