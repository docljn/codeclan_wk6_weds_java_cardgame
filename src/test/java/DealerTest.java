import org.junit.Before;
import org.junit.Test;

public class DealerTest {

    Deck deck;
    Dealer dealer;
    Player player;
    Card card;

    @Before
    public void before() {
        deck = new Deck();
        dealer = new Dealer("James");
    }

    @Test
    public void canDealCard(){
        dealer.dealCard(player);

//    }
}
