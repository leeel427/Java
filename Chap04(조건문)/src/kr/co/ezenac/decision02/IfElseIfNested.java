package kr.co.ezenac.decision02;

import java.util.Scanner;

public class IfElseIfNested {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int score = scan.nextInt();
		
		//score 변수의 값에 따라서 조건문 분기가 일어나야 함.
		if (score >= 90) {
			//중첩 if문 (무제한적으로 중첩 if문은 들어갈수 있음.
			//			-- 보통 2개를 초과하지 않도록 하는게 가독성면에서 좋음)
			if (score >= 95) {
				System.out.println("당신은 A+ 등급입니다.");
			}
			else {
				System.out.println("등급은 A0 입니다.");
			}
			System.out.println("점수가 90~ 100점 사이입니다.");
			System.out.println("등급은 A 입니다.");
		}
		else if (score >= 80) {
			if (score >= 85) {
				System.out.println("당신은 B+ 등급입니다.");
			}
			else {
				System.out.println("등급은 B0 입니다.");
			}
		}
		else if (score >= 70) {
			if (score >= 75) {
				System.out.println("당신은 C+ 등급입니다.");
			}
			else {
				System.out.println("등급은 C0 입니다.");
			}
		}
		else if (score >= 60) {
			if (score >= 65) {
				System.out.println("당신은 D+ 등급입니다.");
			}
			else {
				System.out.println("등급은 D0 입니다.");
			}
		}
		else {
			System.out.println("더욱 분발해 주세요.");
		}
			
		
		scan.close();

	}

}
