package domain;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PlayerTest {
	
	Player player1;
	static Player player2;
	
	@Before
	public void testInit() {
		player1 = new Player("Jurand");
	}
	
	@Test
	public void testOfPlayer() {
		assertNotNull(player1.getName());
		assertEquals(player1.getPointsOfPlayer() , 301);
	}
	
	@Test
	public void testSubtract() {
		assertTrue(player1.subtractPoints(301));
		assertEquals(player1.getPointsOfPlayer(),0);
		
		assertFalse(player1.subtractPoints(1));
		assertEquals(player1.getPointsOfPlayer(),0);
	}
	
	@BeforeClass
	public static void testBefore() {
		player2 = new Player("Jagienka");
	}
	
	@Test
	public void testThrowDart() {
		player2.playerTurn();
	}

	
}
