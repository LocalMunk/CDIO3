package game;

import desktop_fields.Field;
import desktop_fields.Street;
import desktop_resources.GUI;

public class GameBoard {

	public GameBoard(){
		Field[] fields = new Field[22];
		fields[0] = new Street.Builder().build();
		fields[1] = new Street.Builder().build();
		fields[2] = new Street.Builder().build();
		fields[3] = new Street.Builder().build();
		fields[4] = new Street.Builder().build();
		fields[5] = new Street.Builder().build();
		fields[6] = new Street.Builder().build();
		fields[7] = new Street.Builder().build();
		fields[8] = new Street.Builder().build();
		fields[9] = new Street.Builder().build();
		fields[10] = new Street.Builder().build();
		fields[11] = new Street.Builder().build();
		fields[12] = new Street.Builder().build();
		fields[13] = new Street.Builder().build();
		fields[14] = new Street.Builder().build();
		fields[15] = new Street.Builder().build();
		fields[16] = new Street.Builder().build();
		fields[17] = new Street.Builder().build();
		fields[18] = new Street.Builder().build();
		fields[19] = new Street.Builder().build();
		fields[20] = new Street.Builder().build();
		fields[21] = new Street.Builder().build();
		GUI.create(fields);
	}
}
