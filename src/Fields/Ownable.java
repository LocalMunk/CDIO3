package Fields;

import game.Player;

public abstract class Ownable extends Field {

	protected int price;
	protected Player owner;
	
	
	public abstract int getRent ();
	
	
	
}
