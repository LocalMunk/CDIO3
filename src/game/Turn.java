package game;

public class Turn {

	private int check, numofplayers;
	
	public Turn(int a){
		numofplayers = a;
		check = 1;
	}
	
	public void change(){
		if(check==numofplayers){
			check = 1;
		}
		else{
			check++;
		}
	}
	
	public int getCheck(){
		return check;
	}
}
