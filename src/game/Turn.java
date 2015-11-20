package game;

public class Turn {

	private int check, numofplayers;
	
	public Turn(int a){
		numofplayers = a;
		check = 1;
	}
	
	public void change(){
		if(check == numofplayers){
			check = 1;
			System.out.println("palyer 1 havde turn");
		}
		else{
			check++;
			System.out.println("playererre 2 lal");
		}
	}
	
	public int getCheck(){
		return check;
	}
}
