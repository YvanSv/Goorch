import java.util.ArrayList;

public class Game {
    public int nbPlayers;
    private ArrayList<Player> alPlayers = new ArrayList<Player>();

    public Game(int nbPlayers)
    {
        this.nbPlayers = nbPlayers;
        for (int i = 0; i < nbPlayers; i++)
            this.alPlayers.add(new Player());
    }

    public Player getPlayer(int id)
    {
        for (Player p : this.alPlayers)
            if (p.numPlayer == id) return p;
        return null;
    }
}
