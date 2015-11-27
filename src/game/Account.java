package game;

import game.Player;


public class Account {

	private int balance;
	
	public Account(int a){
		balance = a;
	}
	
	public int getBalance(){
		return balance;
	}
	/**
	 *	Attempts towithdraw the given ammount, if there is not enough money to withdraw it only withdraws so much that there is 0 left
	 *	returns the withdrawn amount
	 */
	public int withdraw(int take){
		int out;
		if(take < balance && take > 0){
			balance = balance - take;
			out = take;
			System.out.println("Withdraw Successful");
		}
		else{
			System.out.println("Withdraw failed");
			out = balance;
			balance = 0;
		}
		return out;
	}
	// deposits the given amount only if the given amount is a positive number
	public void deposit(int give){
		if(give > 0){
			balance += give;
			System.out.println("Deposit successful");
		}
		else{
			System.out.println("Deposit failed");
		}
	}
	
	
	public String toString(Player player){
		return(player + " har " + balance + " kroner");
	}
}

