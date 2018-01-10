import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Player player;

    @Before
    public void before() {
        game = new Game(2);
        player = new Player("Jeeves");
    }

    @Test
    public void gameStartsWithNoPlayers(){
        assertEquals(0, game.getPlayerCount());
    }

    @Test
    public void gameCanTakePlayers(){
        game.addPlayer(player);
        assertEquals(1, game.getPlayerCount());
    }

    @Test
    public void playerNumberCannotExceedNumberPlaying(){
        for(int i = 0; i < 3; i++){
            game.addPlayer(player);
        }
        assertEquals(2, game.getPlayerCount());
    }

    @Test
    public void 




}
