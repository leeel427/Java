package kr.co.ezenac.arraylist;

/*
 *  학생이 수강한 과목의 학점을 출력하시오.
 *  2022학번 Lee과 2021학번 Shin 두 학생이 있습니다.
 *  Lee 학생은 국어와 수학 2과목 수강했고,
 *  Shin 학생은 국어,수학,영어 3과목을 수강했습니다.
 *  
 *  Lee 학생은 국어 100점, 수학70점 입니다.
 *  Shin 학생은 국어 70점, 수학 90점,영어 100점입니다.
 *  ArrayList를 활용하여 두 학생의 과목 성적과 총점을 구하시오.
 *  
 *  
 */




public class StudentTest {

	public static void main(String[] args) {
		Student StudentL = new Student(2022, "Lee");
		StudentL.addSubject("국어", 100);
		StudentL.addSubject("수학", 70);
		
		Student StudentS = new Student(2021, "Shin");
		StudentS.addSubject("국어", 70);
		StudentS.addSubject("수학", 90);
		StudentS.addSubject("영어", 100);

		StudentL.showInfo();
		System.out.println();
		StudentS.showInfo();
		
		
	}

}
