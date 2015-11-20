package game;

public class Player {
	private Account account;
	private String name;
	private int position;
	
	public Player(String x){
		name = x;
		account = new Account();
		position = 1;
	}
	
	public String getName(){
		return name;
	}

	public Account getAccount(){
		return account;
	}
	
	public int getPosition(){
		return position;
	}
	
	public void setPosition(int x){
		position += x;
	}
}
