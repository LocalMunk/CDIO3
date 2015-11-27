package game;

import desktop_resources.GUI;

public class Run {
/**
 * Runs the game.
 */
	public static void main(String[] args) {
		GameController control = new GameController();
		control.loop();
		GUI.close();
	}
}