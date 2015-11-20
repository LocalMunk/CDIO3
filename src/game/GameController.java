package game;

import desktop_resources.GUI;

public class GameController {
	
	private Player[] players;
	
	public GameController(String[] names){
		GameBoard board = new GameBoard();
		int x = GUI.getUserInteger("How many players(2-6 players)", 2, 6);
		this.players = new Player[players];
		for(int i = 0; i < x; i++){
			this.players[i] = new Player(names[i]);
			GUI.addPlayer(this.players[i].getName(), 30000);
			GUI.setCar(1, this.players[i].getName());
		}
		Turn turn = new Turn(players);
		Dice dice = new Dice(6);
	}
}