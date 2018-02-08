package domain;


import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;



import org.junit.Test;

public class GameTest {
	Player player1;
	Player player2;
	Game game;
	
	@Before
	public void initTest() {
		player1 = new Player("Zbyszko z Bogdanca");
		player2 = new Player("Macko z Bogdanca");
		game = new Game(player1,player2);
	}
	
	@Test
	public void changePlayer() {
		game.changePlayer();
		assertEquals(game.playerWhoPlay , player2);
		assertEquals(game.playerWhoRest , player1);
		game.changePlayer();
		assertEquals(game.playerWhoPlay , player1);
		assertEquals(game.playerWhoRest , player2);
	}
	
	@Test
	public void testGame() {
		assertNotNull(game);
		game.playGame();
		assertEquals(game.playerWhoPlay.getPointsOfPlayer() , 0);
	}

}
