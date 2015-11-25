package Fields;

import desktop_resources.GUI;
import game.Player;

public  class Fleet extends Ownable {

		private final int RENT_1 = 500;
		private final int RENT_2 = 1000;
		private final int RENT_3 = 2000;
		private final int RENT_4 = 4000;
		private String name;
		private final int price = 4000;
		
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
			if (player == owner) {
				GUI.showMessage("You own this field");
			}

			else if (owned != true && player.getAccount().getBalance() >= price) {
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
			else if(owned = true && owner != player){
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
				System.out.println("jeg er rekker");
			}
		}
		@Override
		public int getPrice() {
			return 0;
		}
		@Override
		public void setOwner() {
			// TODO Auto-generated method stub
			
		}
		@Override
		public Player getOwner() {
			// TODO Auto-generated method stub
			return null;
		}
	
	
}
