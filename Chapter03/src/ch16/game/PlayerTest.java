package ch16.game;

public class PlayerTest {

	public static void main(String[] args) {
		
		Player player = new Player();
		player.play(1);
		
		AdvancedLevel advanced = new AdvancedLevel();
		player.upgradeLevel(advanced);
		player.play(2);
		
		SuperLevel supered = new SuperLevel();
		player.upgradeLevel(supered);
		player.play(3);
		
	}

}
