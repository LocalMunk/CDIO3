package Test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Fields.LaborCamp;
import Fields.Territory;
import game.Player;

public class LandOnFieldTerritory {

	private Player player, player2,player3;
	private Territory territory1;

	@Before

	public void setUp() throws Exception {
		this.player = new Player("Bob", 500, true);
		this.player2 = new Player("Henrik", 5000, true);
		this.player3 = new Player("Bo",5000,true);
		this.territory1 = new Territory(100, 1000, "Tribe Encampment", 1);

	}

	@Test

	public void testEntities() {

		this.player = new Player("Henrik", 5000, true);

		// The fields are unaltered

		Assert.assertNotNull(this.player);
		Assert.assertNotNull(this.player2);
		Assert.assertNotNull(this.territory1);

	}

	@Test
	public void LandOnFieldBuyField() {
			// Tests that the players balance is 5000
		int expected = 5000;

		int actual = this.player2.getAccount().getBalance();

		Assert.assertEquals(expected, actual);

		// Tests that the player is able to buy the field

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



@Test
public void LandOnFieldRent(){
	
	
	
	// Tests that the players balance is 5000
	int expected = 5000;
	int expected2 = 5000;
	int actual = this.player2.getAccount().getBalance();
	int actual2 = this.player3.getAccount().getBalance();

	Assert.assertEquals(expected, actual);
	Assert.assertEquals(expected2, actual2);	
	// Tests that the player is able to buy the field

	this.territory1.landOnField(this.player2);
	this.territory1.landOnField(player3);
	expected2 = 4900;

	actual = this.player3.getAccount().getBalance();

	Assert.assertEquals(expected2, actual);
	
	
	
}
}