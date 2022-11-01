package kr.co.ezenac.operator;

public class AssignmentTest02 {

	public static void main(String[] args) {
		short num = 10;
		num += 77L;
		System.out.println(num);
		
		num = (short)(num + 77L);
		System.out.println(num);

	}

}
