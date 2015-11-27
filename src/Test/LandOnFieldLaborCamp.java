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
	private Player player2;
	private boolean owned = false;
	private LaborCamp Laborcamp;

	@Before

	public void setUp() throws Exception {

		this.player = new Player("Henrik", 5000, true);
		this.player2 = new Player("Bob", 500, true);
		this.Laborcamp = new LaborCamp(2500, 2);

	}

	@Test

	public void testEntities() {

		this.player = new Player("Henrik", 5000, true);

		// The fields are unaltered

		Assert.assertNotNull(this.player);

		Assert.assertNotNull(this.Laborcamp);
		Assert.assertTrue(this.Laborcamp instanceof LaborCamp);
	}

	@Test

	public void testLandOnFieldLaborCamp() {

		int expected = 5000;

		int actual = this.player.getAccount().getBalance();

		Assert.assertEquals(expected, actual);

		//Tests the LandOnField method from LaborCamp

		this.Laborcamp.landOnField(this.player);

		expected = 2500;

		actual = this.player.getAccount().getBalance();
		
		Assert.assertEquals(expected, actual);
		// Tests that the player is actually the owner of the field he just bought
		Assert.assertEquals(player, Laborcamp.getOwner());

	}

	
	@Test
	public void testInsufficientFunds() {

		this.Laborcamp.landOnField(this.player2);

		Assert.assertNotEquals(player2, this.Laborcamp.getOwner());

	}

}
