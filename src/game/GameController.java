package game;

import desktop_resources.GUI;

public class GameController {
	
	private Player[] players;
	private Dice dice;
	private Turn turn;
	private GameBoard board;
	private String[] y;
	
	public GameController(){
		board = new GameBoard();
		//int x = GUI.getUserInteger("How many players(2-6 players)", 2, 6);
		int x = 2;
		this.players = new Player[x];
		for(int i = 0; i < x; i++){
			//y = GUI.getUserString("What is your name?");
			y = new String[2];
			y[0] ="hej";
			y[1] ="farvel";
			this.players[i] = new Player(y[i], 30000);
			GUI.addPlayer(this.players[i].getName(), 30000);
			GUI.setCar(1, this.players[i].getName());
		}
		turn = new Turn(x);
		dice = new Dice(6);
	}
	
	public void loop(){
		while(true){
			game(players[turn.getCheck()-1]);
		}
	}
	
	public void game(Player player){
		if(GUI.getUserButtonPressed("Press ENTER to roll the dice", "ENTER").equals("ENTER")){
			dice.roll();
			for(int i = 0; i < dice.getValue(); i++){
				if(player.getPosition() < 22){
					GUI.removeAllCars(player.getName());
					player.setPosition(1);
					GUI.setCar(player.getPosition(), player.getName());
				}
				else{
					GUI.removeAllCars(player.getName());
					player.setPosition(-21);
					GUI.setCar(player.getPosition(), player.getName());
				}
			}
			board.getAreas(player.getPosition()).landOnField(player);
			turn.change();
			
		}
	}
}