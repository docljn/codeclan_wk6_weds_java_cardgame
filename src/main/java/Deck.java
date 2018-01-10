import java.util.ArrayList;

public class Deck {

    ArrayList<Card> cardDeck;
    Card card;
    Suit[] allSuits;
    Rank[] allRanks;

    public Deck(){
        this.cardDeck = new ArrayList<>();
        this.card = card;

    }


    public ArrayList<Card> getCardDeck() {
        return this.cardDeck;
    }

    public void fillDeck() {
        Suit[] allSuits = Suit.values();
        Rank[] allRanks = Rank.values();


        for (Suit i: allSuits){
            for (Rank j: allRanks) {
                Card newCard = new Card(i, j);
                this.cardDeck.add(newCard);
            }
        }

    }
}
