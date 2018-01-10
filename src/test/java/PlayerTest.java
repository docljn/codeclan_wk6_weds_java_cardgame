import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Card card;

    @Before
    public void before(){
        player = new Player("Eric");
        card = new Card(Suit.HEARTS, Rank.QUEEN);
    }

    @Test
    public void playerCanAcceptCard(){
        player.acceptCard(card);
        assertEquals(1, player.getHand().size());
    }


}
