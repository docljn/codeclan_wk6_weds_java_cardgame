import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void before(){
        this.deck = new Deck();

    }

    @Test
    public void deckStartsEmpty(){
        assertEquals(0, deck.getCardDeck().size());
    }

    @Test
    public void deckHas52Cards(){
        deck.fillDeck();
        assertEquals(52, deck.getCardDeck().size());
    }

    @Test
    public void deckHasAceOfClubsFirstCard(){
        deck.fillDeck();
        Card card = deck.getCardDeck().get(0);
        assertEquals(Suit.CLUBS, card.getSuit());
        assertEquals(Rank.ACE, card.getRank());
    }

}
