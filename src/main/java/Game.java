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

    public void dealCards() {
        if (readyToPlay()){
            for (Player player: players) {
                dealer.dealCard(player);
            }
        }

    }

    public void checkForWinner() {
//  only works for a game with two players
        if (players.get(0).getHandScore() != players.get(1).getHandScore()) {
            this.won = true;
        }
    }

    
    public Player getWinner() {
        Player winner;
            if (players.get(0).getHandScore() > players.get(1).getHandScore()) {
                winner = players.get(0);
            } else {
                winner = players.get(1);
            }
            return winner;
//  I can't see how to check if a game is won before checking for a winner....
    }


    public HashMap<Player, Integer> recordScores() {
//        ended up not using this method yet - maybe useful if more than one player
        HashMap<Player, Integer> scoresHashMap = new HashMap<>();
        for (Player player: players
                ) {scoresHashMap.put(player, player.getHandScore());
        }
        return scoresHashMap;
    }


}

