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
		fields[0] = new Start.Builder().setTitle("Hometown").build();											// Start: Oxford
		fields[1] = new Street.Builder().setTitle("Tribe Encampment").setSubText("Price = 1000").setDescription("Price is 1000 and rent is 100").build();				// Territory: Tribe Encampment
		fields[2] = new Street.Builder().setTitle("Labor Camp").setSubText("Price = 2500").setDescription("Price is 2500, pay 100xvalue on dice").build();					// Labor Camp: Huts in the Mountain
		fields[3] = new Street.Builder().setTitle("Crater").setSubText("Price = 1500").setDescription("Price is 1500 and rent is 300").build();						// Territory: Crater
		fields[4] = new Tax.Builder().setTitle("Goldmine").setSubText("Pay 2000 when landing here").setDescription("Pay 2000").build();							// Tax: Goldmine
		fields[5] = new Street.Builder().setTitle("Mountain").setSubText("Price = 2000").setDescription("Price is 2000 and rent is 500").build();					   	// Territory: Mountain
		fields[6] = new Shipping.Builder().setTitle("Second Sail").setSubText("Price = 4000").setDescription("Price is 4000, pay 500 for 1 fleet, 1000 for, 2000 for 3, 4000 for 4").build();					// Fleet: Second Sail
		fields[7] = new Street.Builder().setTitle("Cold Desert").setSubText("Price = 3000").setDescription("Price is 3000 and rent is 700").build();					// Territory: Cold Desert
		fields[8] = new Refuge.Builder().setTitle("Walled City").setSubText("Recieve 5000").setDescription("Recieve 5000 gold coins").build();					// Refuge: Walled City 
		fields[9] = new Street.Builder().setTitle("Black Cave").setSubText("Price = 4000").setDescription("Price is 4000 and rent is 1000").build();					// Territory: Black Cave
		fields[10] = new Shipping.Builder().setTitle("Sea Grover").setSubText("Price = 4000").setDescription("Price is 4000, pay 500 for 1 fleet, 1000 for, 2000 for 3, 4000 for 4").build();					// Fleet: Sea Grover
		fields[11] = new Street.Builder().setTitle("The Werewall").setSubText("Price = 4300").setDescription("Price is 4300 and rent is 1300").build();					// Territory: The Werewall
		fields[12] = new Street.Builder().setTitle("The Pit").setSubText("Price = 2500").setDescription("Price is 2500, pay 100xvalue on dice").build();						// Labor Camp: The Pit
		fields[13] = new Street.Builder().setTitle("Mountain Village").setSubText("Price = 4750").setDescription("Price is 4750 and rent is 1600").build();				// Territory: Mountain Village
		fields[14] = new Tax.Builder().setTitle("Caravan").setSubText("Pay 4000 or 10% of total Gold coins").setDescription("Pay 4000 or 10%").build();							// Tax: Caravan
		fields[15] = new Street.Builder().setTitle("South Citadel").setSubText("Price = 5000").setDescription("Price is 5000 and rent is 2000").build();				// Territory: South Citadel
		fields[16] = new Shipping.Builder().setTitle("The Buccaneers").setSubText("Price = 4000").setDescription("Price is 4000, pay 500 for 1 fleet, 1000 for, 2000 for 3, 4000 for 4").build();				// Fleet: The Buccaneers
		fields[17] = new Street.Builder().setTitle("Palace Gates").setSubText("Price = 5500").setDescription("Price is 5500 and rent is 2600").build();					// Territory: Palace Gates
		fields[18] = new Refuge.Builder().setTitle("Monastery").setSubText("Recieve 500").setDescription("recieve 500 gold coins").build();					// Refuge: Monastery
		fields[19] = new Street.Builder().setTitle("Tower").setSubText("Price = 6000").setDescription("Price is 6000 and rent is 3200").build();						// Territory: Tower
		fields[20] = new Shipping.Builder().setTitle("Privateer Armada").setSubText("Price = 4000").setDescription("Price is 4000, pay 500 for 1 fleet, 1000 for, 2000 for 3, 4000 for 4").build();			// Fleet: Privateer Armada
		fields[21] = new Street.Builder().setTitle("Castle").setSubText("Price = 8000").setDescription("Price is 8000 and rent is 4000").build();						// Territory Castle
		GUI.create(fields);
	}
}
