package Test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Fields.LaborCamp;
import Fields.Territory;
import game.Player;

public class LandOnFieldTerritory {

	private Player player, player2;
	private boolean owned = false;
	private Territory territory1;

	@Before

	public void setUp() throws Exception {
		this.player = new Player("Bob", 500, true);
		this.player2 = new Player("Henrik", 5000, true);

		this.territory1 = new Territory(100, 1000, "Tribe Encampment", 1);

	}

	@Test

	public void testEntities() {

		this.player = new Player("Henrik", 5000, true);

		// The fields are unaltered

		Assert.assertNotNull(this.player);

		Assert.assertNotNull(this.territory1);

	}

	@Test
	public void LandOnFieldBuyField() {

		int expected = 5000;

		int actual = this.player2.getAccount().getBalance();

		Assert.assertEquals(expected, actual);

		// Perform the action to be tested

		this.territory1.landOnField(this.player2);

		expected = 4000;

		actual = this.player2.getAccount().getBalance();

		Assert.assertEquals(expected, actual);

	}

	@Test
	

	public void PlayerisOwner() {

		this.territory1.landOnField(this.player2);

		Assert.assertEquals(player2, territory1.getOwner());

	}

	@Test

	public void testInsufficientFunds() {

		this.territory1.landOnField(this.player);

		Assert.assertNotEquals(player2, this.territory1.getOwner());

	}

}
