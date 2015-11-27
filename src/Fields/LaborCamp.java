package Fields;

import desktop_resources.GUI;
import game.Dice;
import game.Player;

public class LaborCamp extends Ownable {

	private int price;
	private Dice dice = new Dice(6);
	
	/**
	 * Creates a LaborCamp field
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
		/** Checks whether the player is owner of the field
		 * 
		 */
		else if (owned == false) {

			/**If the field is not owned, the player is asked wether he wants to buy the field or not
			 * It then checks the player's balance to see if there is sufficient money
			 * If the player buys the field he is set as the owner and withdraws the price from the players account
			 * The GUI is updated with the correct information
			 */
			if (player.getAccount().getBalance() >= price && GUI.getUserLeftButtonPressed("Do you want to buy this field?", "Yes", "No")) {
				owned = true;
				owner = player;
				GUI.setOwner(fieldnumber+1, owner.getName());
				player.getAccount().withdraw(price);
				GUI.setBalance(player.getName(), player.getAccount().getBalance());
				player.setLaborCampsOwned(player.getLaborCampsOwned() + 1);
			}

		}
		
		/**
		 * Withdraws a dice roll times 100 times how many LaborCamps is other by the otherplayer
		 * 
		 */
		else if(owned && owner != player){
			int getmoney = dice.roll();
			owner.getAccount().deposit(player.getAccount().withdraw(getmoney * 100 * owner.getLaborCampsOwned()));
			GUI.setBalance(player.getName(), player.getAccount().getBalance());
			GUI.setBalance(owner.getName(), owner.getAccount().getBalance());
		}
		else if(price > player.getAccount().getBalance())
		{
			GUI.showMessage("Your balance is too low");
			
		}

	}
		/**
		 * Returns the price of the field
		 */
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
		/**
		 * Sets the owner
		 */
	@Override
	public void setOwner(Player player) {
		player = owner;

	}

		/** 
		 * Returns the owner of a given field
		 */
	@Override
	public Player getOwner() {
		// TODO Auto-generated method stub
		return owner;
	}
	/**
	 * Release the fields owned by a given player at his death
	 */
	@Override
	public void setOwned(boolean bool) {
		// TODO Auto-generated method stub
		owned = bool;
	}
}
