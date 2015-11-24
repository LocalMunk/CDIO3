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
	
	
}
