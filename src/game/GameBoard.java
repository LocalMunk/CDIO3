package game;

import desktop_fields.Field;
import desktop_fields.Street;
import desktop_resources.GUI;
import desktop_resources.GUI;
import desktop_fields.Tax;
import desktop_fields.Refuge;
import desktop_fields.Start;
import desktop_fields.Shipping;



public class GameBoard {

	public GameBoard(){
		Field[] fields = new Field[22];
		fields[0] = new Start.Builder().build();											// Start: Oxford
		fields[1] = new Street.Builder().setTitle("Tribe Encampment").build();				// Territory: Tribe Encampment
		fields[2] = new Street.Builder().setTitle("Labor Camp").build();					// Labor Camp: Huts in the Mountain
		fields[3] = new Street.Builder().setTitle("Crater").build();						// Territory: Crater
		fields[4] = new Tax.Builder().setTitle("Goldmine").build();							// Tax: Goldmine
		fields[5] = new Street.Builder().setTitle("Mountain").build();					   	// Territory: Mountain
		fields[6] = new Shipping.Builder().setTitle("Second Sail").build();					// Fleet: Second Sail
		fields[7] = new Street.Builder().setTitle("Cold Desert").build();					// Territory: Cold Desert
		fields[8] = new Refuge.Builder().setTitle("Walled City").build();					// Refuge: Walled City 
		fields[9] = new Street.Builder().setTitle("Black Cave").build();					// Territory: Black Cave
		fields[10] = new Shipping.Builder().setTitle("Sea Grover").build();					// Fleet: Sea Grover
		fields[11] = new Street.Builder().setTitle("The Werewall").build();					// Territory: The Werewall
		fields[12] = new Street.Builder().setTitle("The Pit").build();						// Labor Camp: The Pit
		fields[13] = new Street.Builder().setTitle("Mountain Village").build();				// Territory: Mountain Village
		fields[14] = new Tax.Builder().setTitle("Caravan").build();							// Tax: Caravan
		fields[15] = new Street.Builder().setTitle("South Citadel").build();				// Territory: South Citadel
		fields[16] = new Shipping.Builder().setTitle("The Buccaneers").build();				// Fleet: The Buccaneers
		fields[17] = new Street.Builder().setTitle("Palace Gates").build();					// Territory: Palace Gates
		fields[18] = new Refuge.Builder().setTitle("Monastery").build();					// Refuge: Monastery
		fields[19] = new Street.Builder().setTitle("Tower").build();						// Territory: Tower
		fields[20] = new Shipping.Builder().setTitle("Privateer Armada").build();			// Fleet: Privateer Armada
		fields[21] = new Street.Builder().setTitle("Castle").build();						// Territory Castle
		GUI.create(fields);
	}
}
