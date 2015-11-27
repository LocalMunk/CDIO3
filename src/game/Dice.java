package game;

import desktop_resources.GUI;

public class Dice {

	private int sides, value;
	
	public Dice(int a){
		sides = a;
	}
	
	public int roll(){
		int a = (int)(Math.random() * sides + 1);
		int b = (int)(Math.random() * sides + 1);
		GUI.setDice(a, b);
		value = a + b;
		return value;
	}
	
	public int getValue(){
		return value;
	}
}
