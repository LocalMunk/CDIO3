package Test;
import game.GameBoard;
import game.Player;
import Fields.Ownable;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Fields.LaborCamp;
import Fields.Refuge;


public class LandOnFieldLaborCamp {
	private Player player;
	private boolean owned = false;
	private LaborCamp hej;
	
	
	
	@Before

	public void setUp() throws Exception {

		this.player = new Player("Henrik", 5000, true);

		this.hej = new LaborCamp(2500,2);

		
	}
	
	

	@Test

	public void testEntities() {

		this.player = new Player("Henrik", 5000, true);

		// The fields are unaltered

		Assert.assertNotNull(this.player);

		Assert.assertNotNull(this.hej);

		
	}
	
	

	@Test

	public void testLandOnFieldLaborCamp() {

		int expected = 5000;

		int actual = this.player.getAccount().getBalance();

		Assert.assertEquals(expected, actual);

		// Perform the action to be tested

		this.hej.landOnField(this.player);

		expected = 2500;

		actual = this.player.getAccount().getBalance();

		Assert.assertEquals(expected, actual);
		
	}
	
	
	@Test 
	
	public void testLandonFieldOwner(){
		
		

		int expected = 5000;

		int actual = this.player.getAccount().getBalance();

		Assert.assertEquals(expected, actual);

		// Perform the action to be tested

		this.hej.landOnField(this.player);

		expected = 2500;

		actual = this.player.getAccount().getBalance();

		Assert.assertEquals(expected, actual);
		
		
		
	}


	
	

}
