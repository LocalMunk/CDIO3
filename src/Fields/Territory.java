package Fields;

import desktop_resources.GUI;
import game.Player;

public class Territory extends Ownable {
	
	
	private int rent, price;
	private Player owner;
	private boolean owned;
	private String name

	public Territory(int a, int b, String c){
		rent = a;
		price = b;
		owned = false;
		name = c;
	}
	@Override
	public int getRent() {
		return rent;
	}

	@Override
	public void landOnField(Player player) {
		if (player == owner) {

			GUI.showMessage("You own this field");

		}

		else if (owned == false) {

			if (player.getAccount().getBalance() >= price && GUI.getUserLeftButtonPressed("Do you want to buy this fieldfield?", "Yes", "No")) {
				owned = true;
				owner = player;

			}

		}
		else if(owned = true && owner != player){
			player.getAccount().withdraw(baseRent);
			owner.getAccount().deposit(baseRent);
		}
	}

	public int getPrice(){
		return price;
	}
	
	public Player getOwner(){
		return owner;
	}
	public void setOwner(Player player ) {
		// TODO Auto-generated method stub
		owner = player;
	}
	@Override
	public void setOwner() {
		// TODO Auto-generated method stub
		
	}
}
