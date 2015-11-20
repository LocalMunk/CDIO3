package game;

import desktop_resources.GUI;

public class GameController {
	
	private Player[] players;
	
	public GameController(){
		GameBoard board = new GameBoard();
		int x = GUI.getUserInteger("How many players(2-6 players)", 2, 6);
		String y;
		this.players = new Player[x];
		for(int i = 0; i < x; i++){
			y = GUI.getUserString("What is your name?");
			this.players[i] = new Player(y);
			GUI.addPlayer(this.players[i].getName(), 30000);
			GUI.setCar(1, this.players[i].getName());
		}
		Turn turn = new Turn(x);
		Dice dice = new Dice(6);
	}
}