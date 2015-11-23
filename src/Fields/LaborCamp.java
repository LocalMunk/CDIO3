package Fields;

import desktop_resources.GUI;
import game.Player;

public class LaborCamp extends Ownable {

	private int price;
	
	public LaborCamp(int a){
		price = a;
		owned = false;
	}

	@Override
	public int getRent() {

		return 0;
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
				player.getAccount().withdraw(price);

			}

		}
		else if(owned = true && owner != player){
			
			player.getAccount().withdraw(baseRent);
			owner.getAccount().deposit(baseRent);
		}

	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public void setOwner(Player player) {
		player = owner;

	}

	@Override
	public Player getOwner() {
		// TODO Auto-generated method stub
		return owner;
	}

	@Override
	public void setOwner() {
		// TODO Auto-generated method stub
		
	}

}
