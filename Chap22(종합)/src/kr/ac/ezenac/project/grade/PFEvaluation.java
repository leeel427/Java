package kr.ac.ezenac.project.grade;

public class PFEvaluation implements GradeEvaluation {

	@Override
	public String getGrade(int score) {
		
		String grade;
		
		if (score >= 70) {
			grade = "P";
		}
		else 
			grade = "F";
		
			
//		if (score >= 70) return "P";
//		else return "F";				// 강사님
		
		
		return grade;
	}

}
