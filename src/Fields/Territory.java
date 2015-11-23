package Fields;

import game.Player;

public class Territory extends Ownable {
	
	
	private int rent, price;
	private Player owner;
	private boolean owned;

	public Territory(int a, int b){
		rent = a;
		price = b;
		owned = false;
	}
	@Override
	public int getRent() {
		return rent;
	}

	@Override
	public void landOnField(Player player) {
		
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
}
