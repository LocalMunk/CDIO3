package Fields;

import desktop_resources.GUI;
import game.Player;

public class Refuge extends Area{

	private int bonus;
	
	/**
	 * Creates a refuge field, that contains a bonus
	 * @param a bonus (int)
	 */
	public Refuge(int a){
		bonus = a;
	}
		/**
		 * The player receives a bonus witch is deposited onto his account
		 */
	@Override
	public void landOnField(Player player) {
		player.getAccount().deposit(bonus);
		GUI.setBalance(player.getName(), player.getAccount().getBalance());
	}

	@Override
	public Player getOwner() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setOwned(boolean bool) {
		// TODO Auto-generated method stub
		
	}
}
