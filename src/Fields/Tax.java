package Fields;

import game.Player;

public class Tax extends Area {
	
	private int taxAmount;
	private int taxRate = -1;

	public Tax(int a){
		taxAmount = a;	
	}

	@Override
	public void landOnField(Player player) {
		// TODO Auto-generated method stub
		
	}

	public int getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(int taxAmount) {
		this.taxAmount = taxAmount;
	}
}
