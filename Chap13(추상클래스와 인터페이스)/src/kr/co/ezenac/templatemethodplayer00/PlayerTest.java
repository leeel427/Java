package kr.co.ezenac.templatemethodplayer00;

public class PlayerTest {

	public static void main(String[] args) {
		
	
		Player player = new Player();
		player.play(1);
		
		System.out.println();
	
		PlayerLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		System.out.println();
		
		PlayerLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
	
		System.out.println();

		
	}

}
