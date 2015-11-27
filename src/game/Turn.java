package game;

public class Turn {

	private int check;
	private GameController control;
	
	public Turn(GameController a){
		check = 1;
		control = a;
	
	}
	/**
	 * changes the turn of the players
	 */
	public void change(){
		if(check == control.getamountop()){
			check = 1;
		}
		else{
			check++;
		}
	}
	
	public int getCheck(){
		return check;
	}
}
