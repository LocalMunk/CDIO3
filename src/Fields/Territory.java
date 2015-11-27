package Fields;

import desktop_resources.GUI;
import game.Player;

public class Territory extends Ownable {
	
	
	private int rent, price;
	private Player owner;
	private boolean owned, buybutton;
	private String name;

	/**
	 * Makes a territory field
	 * @param a Rent (int)
	 * @param b Field price (int)
	 * @param c Field name (string)
	 * @param d Field number (int)
	 */
	public Territory(int a, int b, String c, int d){
		rent = a;
		price = b;
		owned = false;
		name = c;
		fieldnumber = d;
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

		else if (owned != true && player.getAccount().getBalance() >= price) {
			if(GUI.getUserLeftButtonPressed("Do you want to buy this field", "Yes", "No"))
			{
				owned = true;
				owner = player;
				GUI.showMessage("You are the proud owner of this.");
				GUI.setOwner(fieldnumber+1, owner.getName());
				player.getAccount().withdraw(price);
				GUI.setBalance(player.getName(), player.getAccount().getBalance());
			}
		}
		else if(owned && owner != player){
			owner.getAccount().deposit(player.getAccount().withdraw(rent));
			GUI.setBalance(player.getName(), player.getAccount().getBalance());
			GUI.setBalance(owner.getName(), owner.getAccount().getBalance());
		}
		else if(price > player.getAccount().getBalance())
		{
			GUI.showMessage("Your balance is too low,n00b");
			
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
	public void setOwned(boolean bool) {
		// TODO Auto-generated method stub
		owned = bool;
	}
}
