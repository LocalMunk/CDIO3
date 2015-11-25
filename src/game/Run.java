package game;

import desktop_resources.GUI;

public class Run {

	public static void main(String[] args) {
		GameController control = new GameController();
		control.loop();
		GUI.close();
	}
}