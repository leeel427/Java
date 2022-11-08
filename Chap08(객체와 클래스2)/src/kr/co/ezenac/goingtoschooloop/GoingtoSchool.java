package kr.co.ezenac.goingtoschooloop;

public class GoingtoSchool {

	public static void main(String[] args) {
		
		Student student = new Student("이순신", 10000);
		Student student2 = new Student("신사임당", 50000);
		
		Bus bus100 = new Bus(100);
		Subway subway9 = new Subway(9);
		
		student.takeBus(bus100);
		student2.takeSubway(subway9);
		
		student.showInfo();		
		System.out.println();
		student2.showInfo();
		System.out.println();
		bus100.showInfo();
		System.out.println();
		subway9.showInfo();
		System.out.println();
		
		
	}

}
