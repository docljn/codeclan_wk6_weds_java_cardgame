import java.util.ArrayList;

public class Game {

    int numberPlaying;
    ArrayList<Player> players;

    public Game(int numberPlaying){
        this.numberPlaying = numberPlaying;
        this.players = new ArrayList<Player>(){};
    }


    public ArrayList<Player> getPlayers() {
        return this.players;
    }

    public int getPlayerCount() {
        return players.size();
    }

    public void addPlayer(Player player) {
        if(getPlayerCount() < this.numberPlaying) {
            this.players.add(player);
        }
    }
}
