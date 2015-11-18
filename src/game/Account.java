package game;

import game.Player;

public class Account {

	private int balance;
	
	public int getBalance(){
		return balance;
	}
		
	public void withdraw(int take){
		if(take < balance && take > 0){
			balance = balance - take;
			System.out.println("Withdraw Successful");
		}
		else{
			System.out.println("Withdraw failed");
		}
	}
	
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

