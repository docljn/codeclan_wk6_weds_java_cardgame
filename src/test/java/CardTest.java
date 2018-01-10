import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(Suit.HEARTS, Rank.FOUR);
    }

    @Test
    public void hasSuitHearts(){
        assertEquals(Suit.HEARTS, card.getSuit());
    }

    @Test
    public void hasRankFour(){
        assertEquals(Rank.FOUR, card.getRank());
    }
}
