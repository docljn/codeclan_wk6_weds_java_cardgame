import java.util.ArrayList;
import java.util.HashMap;

public class Game {

    int numberPlaying;
    ArrayList<Player> players;
    boolean won;
    Dealer dealer;
    Deck deck;

    public Game(int numberPlaying){
        this.numberPlaying = numberPlaying;
        this.players = new ArrayList<Player>(){};
        this.won = false;
        this.deck = new Deck();
        this.dealer = new Dealer("Patrick", deck);
    }


    public ArrayList<Player> getPlayers() {
        return this.players;
    }

    public int getPlayerCount() {
        return players.size();
    }

    public boolean hasSpace(){
        return getPlayerCount() < this.numberPlaying;
    }

    public void addPlayer(Player player) {
        if(hasSpace()) {
            this.players.add(player);
        }
    }

    public boolean isWon() {
        return this.won;
    }


    public boolean readyToPlay() {
        return (!hasSpace() && !isWon());
    }

    public void dealRound() {
        if (readyToPlay()){
            for (Player player: players) {
                dealer.dealCard(player);
            }
        }

    }


    public HashMap<Player, Integer> recordScores() {
        HashMap<Player, Integer> scoresHashMap = new HashMap<>();
        for (Player player: players
             ) {scoresHashMap.put(player, player.getHandScore());
        }
        return scoresHashMap;
    }
}
