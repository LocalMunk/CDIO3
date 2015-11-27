package Fields;

import desktop_resources.GUI;
import game.Dice;
import game.Player;

public class LaborCamp extends Ownable {

	private int price;
	private Dice dice = new Dice(6);
	
	/**
	 * Makes a LaborCamp field
	 * @param a Field price (int)
	 * @param b Field number (int)
	 */
	public LaborCamp(int a, int b){
		price = a;
		fieldnumber = b;
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

			if (player.getAccount().getBalance() >= price && GUI.getUserLeftButtonPressed("Do you want to buy this field?", "Yes", "No")) {
				owned = true;
				owner = player;
				GUI.setOwner(fieldnumber+1, owner.getName());
				player.getAccount().withdraw(price);
				GUI.setBalance(player.getName(), player.getAccount().getBalance());

			}

		}
		else if(owned && owner != player){
			int getmoney = dice.roll();
			owner.getAccount().deposit(player.getAccount().withdraw(getmoney * 100));
			GUI.setBalance(player.getName(), player.getAccount().getBalance());
			GUI.setBalance(owner.getName(), owner.getAccount().getBalance());
		}
		else if(price > player.getAccount().getBalance())
		{
			GUI.showMessage("Your balance is too low,n00b");
			
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
	public void setOwned(boolean bool) {
		// TODO Auto-generated method stub
		owned = bool;
	}
}
