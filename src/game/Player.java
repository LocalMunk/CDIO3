package game;

public class Player {
	private Account account;
	private String name;
	private int position;
	private int fieldsOwned;
	
	public Player(String x, int a){
		name = x;
		account = new Account(a);
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
	
	public void addFieldsOwned(){
		fieldsOwned++;
	}
	
	public int getFieldsOwned(){
		return fieldsOwned;
	}
}
