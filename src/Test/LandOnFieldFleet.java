package Test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Fields.Fleet;
import Fields.LaborCamp;
import game.Player;
public class LandOnFieldFleet {

	   private Player p1;
	   private Player p2;
		private Fleet fleet1;
		private Fleet fleet2;
		private Fleet fleet3;
		private Fleet fleet4;
		
		@Before

		public void setUp() throws Exception {

			this.p1 = new Player("Henrik", 30000, true);
			this.p2 = new Player("Bob", 10000, true);
			this.fleet1 = new Fleet("Sea Grover", 10);
			this.fleet2 = new Fleet("Second Sail", 6);
			this.fleet3 = new Fleet("Privateer Armada", 20);
			this.fleet4 = new Fleet("The Buccaneers", 16);

		}
		
		
		
		@Test
		public void test() {
			
			
			
		}
		@Test
		public void testfleetsowned(){
			fleet1.landOnField(p1);
			fleet1.landOnField(p2);
			int expected = 9500;
			Assert.assertEquals(expected, p2.getAccount().getBalance());
			
			fleet2.landOnField(p1);
			fleet2.landOnField(p2);
			expected = 8500;
			Assert.assertEquals(expected, p2.getAccount().getBalance());
			
			fleet3.landOnField(p1);
			fleet3.landOnField(p2);
			expected = 6500;
			Assert.assertEquals(expected, p2.getAccount().getBalance());
			
			fleet4.landOnField(p1);
			fleet4.landOnField(p2);
			expected = 2500;
			Assert.assertEquals(expected, p2.getAccount().getBalance());
			
		}
	}