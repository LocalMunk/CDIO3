package Fields;

import desktop_resources.GUI;
import game.Player;

public class LaborCamp extends Ownable {

	private int baseRent;
	
	public LaborCamp(int a){
		baseRent = a;
	}

	@Override
	public int getRent() {

		return 0;
	}

	@Override
	public void landOnField(Player player) {
		if (player == owner) {

			System.out.println("Du er ejeren");

		}

		else if (owner == null) {

			if (player.getAccount().getBalance() >= price && GUI.getUserLeftButtonPressed("Buy field?", "Yes", "No")) {

				player = owner;

			}

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
