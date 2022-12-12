package ch16.game;

public class Player {
	PlayerLevel level;
	static int count = 0;
	
	public Player(PlayerLevel level) {
		this.level = level;
	}
	
	String getLevel() {
		return null;
	}
	
	void upgradeLevel(PlayerLevel playerLevel) {
		this.level = playerLevel;
	}
	
	final void play() {
		count++;
		level.go(count);
	}
	
}
