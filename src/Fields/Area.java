package Fields;

import game.Player;

public abstract class Area  {
	
	protected int fieldnumber;
	/**
	 * landOnField describes what happens for a player when they land on a field.
	 * All subclasses implements different behaviors, depending on the field type.
	 * @param player
	 */
	public abstract void landOnField(Player player);
	public abstract Player getOwner();
	public abstract void setOwned(boolean bool);
} 