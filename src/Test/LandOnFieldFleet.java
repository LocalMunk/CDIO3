package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Fields.Fleet;
import Fields.LaborCamp;
import game.Player;

public class LandOnFieldFleet {

   private Player player;
   private Player p2;
	private Fleet fleet1;
	
	@Before

	public void setUp() throws Exception {

		this.player = new Player("Henrik", 5000, true);
		this.p2 = new Player("Bob", 500, true);
		this.fleet1 = new Fleet("Sea Grover", 10);

	}
	
	
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
