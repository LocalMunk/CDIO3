package Fields;

import game.Player;

public abstract class Ownable extends Area {

	protected int price;
	protected Player owner;
	
	
	public abstract int getRent();
	public abstract int getPrice();
	public abstract void setOwner();
	public abstract Player getOwner();
	public void setOwner(Player player) {
		// TODO Auto-generated method stub
		
	}
	
	
}
