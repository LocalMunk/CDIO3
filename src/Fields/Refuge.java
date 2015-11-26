package Fields;

import desktop_resources.GUI;
import game.Player;

public class Refuge extends Area{

	private int bonus;
	
	public Refuge(int a){
		bonus = a;
	}
	
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
