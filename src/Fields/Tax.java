package Fields;

import desktop_resources.GUI;
import game.Player;

public class Tax extends Area {

	private int taxAmount;
	private int taxRate = -1;
	private String fieldName;

	/**
	 * Creates a tax field, that withdraws money from player
	 * @param a Tax amount (int)
	 * @param b Field name (string)
	 */
	public Tax(int a, String b) {
		taxAmount = a;
		fieldName = b;
	}
	/**
	 * Checks wether the field is == Caravan. The Player is then asked to choose between 10% of total assets or 4000
	 * It then widraws 10% or 4000 from the players account
	 */
	@Override
	public void landOnField(Player player) {	
		if (fieldName.equals("Caravan")) {
			if (GUI.getUserLeftButtonPressed("Pay 10% of total assets?, or do you want to pay 4000?", "10%", "4000")) {
				player.getAccount().withdraw(player.getAccount().getBalance() / 10);
			} else {
				player.getAccount().withdraw(taxAmount);
			}
			/** If the field is gold mine it withdraws 2000 from the players account
			 * The GUI then updates the balance
			 */
		} else
			player.getAccount().withdraw(taxAmount);
		GUI.setBalance(player.getName(), player.getAccount().getBalance());

	}
		/** 
		 * Returns the taxamount of a given field
		 * 
		 */
	public int getTaxAmount() {
		return taxAmount;
	}

		/**
		 * Sets the taxamount for a given field
		 */
	public void setTaxAmount(int taxAmount) {
		this.taxAmount = taxAmount;
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
