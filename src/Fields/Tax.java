package Fields;

import desktop_resources.GUI;
import game.Player;

public class Tax extends Area {

	private int taxAmount;
	private int taxRate = -1;
	private String fieldName;

	/**
	 * Makes a tax field, that withdraws money from player
	 * @param a Tax amount (int)
	 * @param b Field name (string)
	 */
	public Tax(int a, String b) {
		taxAmount = a;
		fieldName = b;
	}

	@Override
	public void landOnField(Player player) {	
		if (fieldName.equals("Caravan")) {
			if (GUI.getUserLeftButtonPressed(
					"u want to pay 10% of ur totales moneys, or u wantes to pay me many money(i think maybe 4k", "10%",
					"Many money")) {
				player.getAccount().withdraw(player.getAccount().getBalance() / 10);
			} else {
				player.getAccount().withdraw(taxAmount);
			}
		} else
			player.getAccount().withdraw(taxAmount);
		GUI.setBalance(player.getName(), player.getAccount().getBalance());

	}

	public int getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(int taxAmount) {
		this.taxAmount = taxAmount;
	}

	public int getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(int taxRate) {
		this.taxRate = taxRate;
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
