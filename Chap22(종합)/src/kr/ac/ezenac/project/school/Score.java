package kr.ac.ezenac.project.school;

public class Score {
	
	private int studentID;			// 학번
	private Subject subject;		// 과목
	private int score;				// 점수
	
	public Score(int studentID, Subject subject, int score) {
	//	super();
		this.studentID = studentID;
		this.subject = subject;
		this.score = score;
	}

	public int getStudentID() {
		return studentID;
	}

	public Subject getSubject() {
		return subject;
	}

	public int getScore() {
		return score;
	}
	
	
	
	
	
	
	
	

}
