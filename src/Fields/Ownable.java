package Fields;

import game.Player;

public abstract class Ownable extends Area {

	protected int price;
	protected Player owner;
	protected boolean owned;
	
	public abstract int getRent();
	public abstract int getPrice();
	public abstract void setOwner(Player player);
	
	
	
	
}
