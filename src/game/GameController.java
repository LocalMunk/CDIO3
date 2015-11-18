package game;

import desktop_resources.GUI;

public class GameController {
	
	private Player[] players;
	
	public GameController(int players, String[] names){
		GameBoard board = new GameBoard();
		this.players = new Player[players];
		for(int i = 0; i < players; i++){
			this.players[i] = new Player(names[i]);
			GUI.addPlayer(this.players[i].getName(), 30000);
			GUI.setCar(1, this.players[i].getName());
		}
	}
}