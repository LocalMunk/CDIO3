package Fields;

import game.Player;

public  class LaborCamp extends Ownable {
	
	 	private  int baseRent ;

		@Override
		public int getRent() {
			
			return 0;
		}

		@Override
		public void landOnField(Player player) {
			if(player == owner){
				
				System.out.println("Du er ejeren");
				
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
	

}
