package game;

public class Player {
	private Account account;
	private String name;
	
	public Player(String x){
		name = x;
		account = new Account();
	}
	
	public String getName(){
		return name;
	}

	public Account getAccount(){
		return account;
	}
}
