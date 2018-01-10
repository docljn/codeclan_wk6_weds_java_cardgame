import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Deck deck;
    Dealer dealer;
    Player player;

    @Before
    public void before() {
        deck = new Deck();
        dealer = new Dealer("James", deck);
    }

    @Test
    public void canDealCard(){
        dealer.dealCard(deck, player);
        assertEquals(1, player.getHand().size());
        assertEquals(51, dealer.getDeck().getCardDeck().size() );

//    }
}
