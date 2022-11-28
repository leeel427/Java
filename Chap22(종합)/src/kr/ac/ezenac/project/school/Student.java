package kr.ac.ezenac.project.school;

import java.util.ArrayList;

public class Student {
	
	//	필수과목	국어점수	수학점수
	private String studentName;		// 이름
	private int studentId;			// 학번
	private Subject majorsubject;	// 전공
	private ArrayList<Score> scores = new ArrayList<>();		// 성적 리스트
	
	
	public Student(String studentName, int studentId, Subject majorsubject) {
	//	super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.majorsubject = majorsubject;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public ArrayList<Score> getScores() {
		return scores;
	}

	public void addSubjectScore(Score score) {
		scores.add(score);
	}

	public Subject getMajorsubject() {
		return majorsubject;
	}

	public void setMajorsubject(Subject majorsubject) {
		this.majorsubject = majorsubject;
	}




	
	
	
	

}
