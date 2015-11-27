package Fields;

import desktop_resources.GUI;
import game.Player;

public  class Fleet extends Ownable {
		/** Sets up diffrent rents
		 */
		private final int RENT_1 = 500;
		private final int RENT_2 = 1000;
		private final int RENT_3 = 2000;
		private final int RENT_4 = 4000;
		private String name;
		private final int price = 4000;
		
		/**
		 * Creates a fleet field.
		 * Buying price is predefined at 4.000
		 * @param a Name of the fleet field (String)
		 * @param b Field number (int)
		 */
		public Fleet(String a, int b){
			name = a;
			fieldnumber = b;
		}
		
		@Override
		public int getRent() {
			// TODO Auto-generated method stub
			return 0;

		}
		@Override
		public void landOnField(Player player) {
			/** Checks whether the player is owner of the field
			 * 
			 */
			if (player == owner) {
				GUI.showMessage("You own this field");
			}

			/**If the field is not owned, the player is asked wether he wants to buy the field or not
			 * It then checks the player's balance to see if there is sufficient money
			 * If the player buys the field he is set as the owner and withdraws the price from the players account
			 * The GUI is updated with the correct information
			 */
			else if (owned != true && player.getAccount().getBalance() > price) {
				if(GUI.getUserLeftButtonPressed("Do you want to buy this field?", "Yes", "No")){
					owned = true;
					owner = player;
					GUI.showMessage("You are the proud owner of this.");
					player.addFieldsOwned();
					GUI.setOwner(fieldnumber+1, owner.getName());
					player.getAccount().withdraw(price);
					GUI.setBalance(player.getName(), player.getAccount().getBalance());
				}
			}
			/**If the player is not the owner it then checks how meny fleets is owned by the other player and with draws it form 
			 * the players account
			 */
			else if(owned && owner != player){
				int checker = owner.getFieldsOwned();
				int payout = 0;
				switch(checker){
				case 1: payout = 500;
				break;
				case 2: payout = 1000;
				break;
				case 3: payout = 2000;
				break;
				case 4: payout = 4000;
				break;
				default: System.out.println("Something went terribly wrong, fejlkode 1000");
				}
				owner.getAccount().deposit(player.getAccount().withdraw(payout));
				GUI.setBalance(player.getName(), player.getAccount().getBalance());
				GUI.setBalance(owner.getName(), owner.getAccount().getBalance());
			}
			else{
				System.out.println("An error occured");
			}
		}
		@Override
		public int getPrice() {
			return 0;
		}
		@Override
		/** Sets the owner
		 */
		
		public void setOwner(Player player) {
			// TODO Auto-generated method stub
			owner = player;
			
		}
		/** Returns the owner
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
