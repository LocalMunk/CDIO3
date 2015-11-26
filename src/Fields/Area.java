package Fields;

import game.Player;

public abstract class Area  {
	
	protected int fieldnumber;
	
	public abstract void landOnField(Player player);
	public abstract Player getOwner();
	public abstract void setOwned(boolean bool);
} 