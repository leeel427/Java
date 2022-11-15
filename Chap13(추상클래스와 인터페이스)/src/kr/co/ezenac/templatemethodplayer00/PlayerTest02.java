package kr.co.ezenac.templatemethodplayer00;

import java.util.Scanner;

public class PlayerTest02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		
		Player player = new Player();
		
		if (count == 1) {
		
		player.play(count);
		
		System.out.println();
		}
		
		else if (count == 2) {
		
		PlayerLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(count);
		
		}
		
		else if (count == 3) { 
		
		PlayerLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(count);

		}
		else 
			System.out.println("잘못 입력하셨습니다.");
		
		System.out.println();

		
		scan.close();
		
	}

}
