package game;

import desktop_resources.GUI;

public class Run {

	public static void main(String[] args) {
		String[] names = {"Jens", "Jakob", "Jonathan", "Jesper", "Judas", "Jesus"};
		GameController control = new GameController();
		control.loop();
		GUI.close();
	}
}