package game;

import Fields.Area;
import desktop_resources.GUI;

public class GameController {
	
	private Player[] players;
	private Dice dice;
	private Turn turn;
	private GameBoard board;
	private String y;
	private int amountofplayers;
	
	/**
	 * Builds the necessary objects for the game to begin
	 */
	public GameController(){
		board = new GameBoard();
		this.amountofplayers = 0;
		amountofplayers = GUI.getUserInteger("How many players(2-6 players)", 2, 6);
		this.players = new Player[amountofplayers];
		for(int i = 0; i < amountofplayers; i++){
			y = GUI.getUserString("What is your name?");
			this.players[i] = new Player(y, 30000, true);
			GUI.addPlayer(this.players[i].getName(), 30000);
			GUI.setCar(1,this.players[i].getName());
		}
	
		
		turn = new Turn(this);
		dice = new Dice(6);
	}
	/**
	 * loops through the different players turns
	 */
	public void loop(){
		while(true){
			game(players[turn.getCheck()-1]);
		}
	}
	
	public int getamountop(){
		return this.amountofplayers;
	}
	/**
	 * asks the player to press the button , then rolls the dice and moves the player
	 * calls the method land on field
	 * if the player reaches 0 money, it will terminate the player from the game, 
	 * by excluding him from the playerarray and removing ownership from his owned fields 
	 */
	public void game(Player player){
		if(GUI.getUserButtonPressed(player.getName() + "'s turn, Press ENTER to roll the dice", "ENTER").equals("ENTER")){
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
			board.getAreas(player.getPosition()+1).landOnField(player);
			if(player.getAccount().getBalance() == 0){
				GUI.showMessage(player.getName() + " is dead");
				GUI.removeAllCars(player.getName());
			}
			if(player.getAccount().getBalance() <= 0){
				this.amountofplayers--;
				int length = 0;
				for(Player a: this.players){
					length++;
				}
				this.players[turn.getCheck()-1] = this.players[length - 1];
				for(Area x: board.getAreaList()){
					try{
					if(x.getOwner().getName().equals(player.getName())){
						x.setOwned(false);
					}
					}catch(Exception e){
						
					}
				}
			}
			if(this.amountofplayers == 1){
				GUI.showMessage("u haf won u r da bess,  gr8 m8 i r8 1/8");
				GUI.showMessage("tryk ENTER for at lukke spillet");
				GUI.close();
				System.exit(0);
			}
			turn.change();
			
		}
	}
}