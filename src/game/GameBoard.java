package game;

import desktop_fields.Field;
import desktop_fields.Street;
import desktop_resources.GUI;
import desktop_fields.Tax;
import desktop_fields.Refuge;
import desktop_fields.Start;
import desktop_fields.Shipping;
import Fields.*;


public class GameBoard {

	private Area[] areas = new Area[22];
	private  Field[] fields = new Field[22];
	
	public GameBoard(){
		
		fields[0] = new Start.Builder().setTitle("Hometown").setDescription("Home sweet home. Nothing happens here.").build();											// Start: Oxford
		fields[1] = new Street.Builder().setTitle("Tribe Encampment").setSubText("Price = 1000 Rent=100").setDescription("Tribe encampment: Huts with a campfire by the river").build();				// Territory: Tribe Encampment
		fields[2] = new Street.Builder().setTitle("Huts in the mountain").setSubText("Price = 2500 Rent = 100 x dice").setDescription("Huts in the mountain: Huts, in the mountain (What did you expect?)").build();					// Labor Camp: Huts in the Mountain
		fields[3] = new Street.Builder().setTitle("Crater").setSubText("Price = 1500 Rent=300").setDescription("Crater: A big hole in the ground").build();						// Territory: Crater
		fields[4] = new Tax.Builder().setTitle("Goldmine").setSubText("Our goldmine has collapsed! Give us 2000 please").setDescription("Pay 2000").build();							// Tax: Goldmine
		fields[5] = new Street.Builder().setTitle("Mountain").setSubText("Price = 2000 Rent=500").setDescription("Mountain: Tall mountain with snow on the top").build();					   	// Territory: Mountain
		fields[6] = new Shipping.Builder().setTitle("Second Sail").setSubText("Price = 4000").setDescription("Pay 500 for 1 fleet, 1000 for, 2000 for 3, 4000 for 4").build();					// Fleet: Second Sail
		fields[7] = new Street.Builder().setTitle("Cold Desert").setSubText("Price = 3000 Rent=700").setDescription("Cold dessert: Lots of sand and wind").build();					// Territory: Cold Desert
		fields[8] = new Refuge.Builder().setTitle("Walled City").setSubText("Recieve 5000").setDescription("Walled city: You've provided additional walls: Recieve 5000 gold coins").build();					// Refuge: Walled City 
		fields[9] = new Street.Builder().setTitle("Black Cave").setSubText("Price = 4000 Rent=1000").setDescription("Black cave: There is a unicorn on the wall").build();					// Territory: Black Cave
		fields[10] = new Shipping.Builder().setTitle("Sea Grover").setSubText("Price = 4000").setDescription("Pay 500 for 1 fleet, 1000 for, 2000 for 3, 4000 for 4").build();					// Fleet: Sea Grover
		fields[11] = new Street.Builder().setTitle("The Werewall").setSubText("Price = 4300 Rent=1300").setDescription("The Werewall: Old ruined wall").build();					// Territory: The Werewall
		fields[12] = new Street.Builder().setTitle("The Pit").setSubText("Price = 2500 Rent=100 x dice").setDescription("The pit: Gladiators, gold and women").build();						// Labor Camp: The Pit
		fields[13] = new Street.Builder().setTitle("Mountain Village").setSubText("Price = 4750 Rent=1600").setDescription("Mountain Village: It is a village in the mountains").build();				// Territory: Mountain Village
		fields[14] = new Tax.Builder().setTitle("Caravan").setSubText("Camels and donkeys force you to pay 4000 or 10% of total Gold coins").setDescription("Pay 4000 or 10%").build();							// Tax: Caravan
		fields[15] = new Street.Builder().setTitle("South Citadel").setSubText("Price = 5000 Rent=2000").setDescription("South Citadel: It’s nowhere near north").build();				// Territory: South Citadel
		fields[16] = new Shipping.Builder().setTitle("The Buccaneers").setSubText("Price = 4000").setDescription("Pay 500 for 1 fleet, 1000 for, 2000 for 3, 4000 for 4").build();				// Fleet: The Buccaneers
		fields[17] = new Street.Builder().setTitle("Palace Gates").setSubText("Price = 5500 Rent=2600").setDescription("Palace Gates: Just a door with a guard").build();					// Territory: Palace Gates
		fields[18] = new Refuge.Builder().setTitle("Monastery").setSubText("Recieve 500").setDescription("Monks and nuns are friendly: Recieve 500 gold coins").build();					// Refuge: Monastery
		fields[19] = new Street.Builder().setTitle("Tower").setSubText("Price = 6000 Rent=3200").setDescription("Tower: Rapunzel used to live here").build();						// Territory: Tower
		fields[20] = new Shipping.Builder().setTitle("Privateer Armada").setSubText("Price = 4000").setDescription("Pay 500 for 1 fleet, 1000 for, 2000 for 3, 4000 for 4").build();			// Fleet: Privateer Armada
		fields[21] = new Street.Builder().setTitle("Castle").setSubText("Price = 8000 Rent=4000").setDescription("Castle: Shrek is king Shrek is life").build();						// Territory Castle
		GUI.create(fields);

		
		areas[0] = new Fields.StartField();
		areas[1] = new Territory(100, 1000, "Tribe Encampment", 1);
		areas[2] = new LaborCamp(2500, 2);
		areas[3] = new Territory(300, 1500, "Crater", 3);
		areas[4] = new Fields.Tax(2000, "Goldmine");
		areas[5] = new Territory(500, 2000, "Mountain", 5);
		areas[6] = new Fleet("Second Sail", 6);
		areas[7] = new Territory(700, 3000, "Cold Desert", 7);
		areas[8] = new Fields.Refuge(5000);
		areas[9] = new Territory(1000, 4000, "Black Cave", 9);
		areas[10] = new Fleet("Sea Grover", 10);
		areas[11] = new Territory(1300, 4300, "The Werewall", 11);
		areas[12] = new LaborCamp(2500, 12);
		areas[13] = new Territory(1600, 4750, "Mountain Village", 13);
		areas[14] = new Fields.Tax(4000, "Caravan");
		areas[15] = new Territory(2000, 5000, "South Citadel", 15);
		areas[16] = new Fleet("The Buccaneers", 16);
		areas[17] = new Territory(2600, 5500, "Palace Gates", 17);
		areas[18] = new Fields.Refuge(500);
		areas[19] = new Territory(3200, 6000, "Tower", 19);
		areas[20] = new Fleet("Privateer Armada", 20);
		areas[21] = new Territory(4000, 8000, "Castle", 21);
	}
	
	public Area getAreas(int a){
		a--;
		a--;
		return areas[a];
	}
	
	public Area[] getAreaList(){
		return areas;
	}
}


