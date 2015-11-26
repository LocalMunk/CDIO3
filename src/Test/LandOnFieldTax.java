6package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import game.Player;

import org.junit.Test;


import Fields.Tax;

public class LandOnFieldTax {
	
	
	private Player player;

	private Tax tax2000;

	private Tax	 tax4000;
	
	private Tax tax10procent;

	@Before
	public void setUp() throws Exception {

		this.player = new Player("Henrik", 5000, true);

		this.tax2000 = new Tax(2000,"A wall");

		this.tax10procent = new Tax(0,"Caravan");

		this.tax4000 = new Tax(4000,"Hej");

	}
	
	@After

	public void tearDown() throws Exception {

	}
	
	
	@Test

	public void testEntities() {

		this.player = new Player("Henrik", 5000, true);

		// The fields are unaltered

		Assert.assertNotNull(this.player);

		Assert.assertNotNull(this.tax2000);

		Assert.assertNotNull(this.tax4000);
		
		Assert.assertNotNull(this.tax10procent);

		

		Assert.assertTrue(this.tax2000 instanceof Tax);

		Assert.assertTrue(this.tax4000 instanceof Tax);

		Assert.assertTrue(this.tax10procent instanceof Tax);

	}
	
	
	
	@Test

	public void testLandOnField2000() {

		int expected = 5000;

		int actual = this.player.getAccount().getBalance();

		Assert.assertEquals(expected, actual);

		// Perform the action to be tested

		this.tax2000.landOnField(this.player);

		expected = 3000;

		actual = this.player.getAccount().getBalance();

		Assert.assertEquals(expected, actual);

	}
	
	
	
	@Test

	public void testLandOnField400() {

		int expected = 5000;

		int actual = this.player.getAccount().getBalance();

		Assert.assertEquals(expected, actual);

		// Perform the action to be tested

		this.tax4000.landOnField(this.player);

		expected = 1000;

		actual = this.player.getAccount().getBalance();

		Assert.assertEquals(expected, actual);

	}
	
	
	@Test

	public void testLandOnFieldTax10procent () {

		int expected = 5000;

		int actual = this.player.getAccount().getBalance();

		Assert.assertEquals(expected, actual);

		// Perform the action to be tested

		this.tax10procent.landOnField(this.player);

		
		// It is still not possible to deposit a negative amount

		expected = 4500;

		actual = this.player.getAccount().getBalance();

		Assert.assertEquals(expected, actual);
		

	}

	
	
	
	
		


	
	
	
	
	
	

}
