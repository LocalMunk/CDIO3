package game;

public class Player {
	private Account account;
	private String name;
	private int position;
	private int fieldsOwned;
	private boolean alive;
	
	public Player(String x, int a, boolean b){
		name = x;
		account = new Account(a);
		position = 1;
		alive = b;
		fieldsOwned = 0;
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

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}
}
