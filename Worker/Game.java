package Goorch.Worker;
import java.util.ArrayList;

public class Game {
    private ArrayList<Player> alPlayers = new ArrayList<Player>();

    public Game(int nbPlayers)
    {
        Player.idPlayers = 0;
        for (int i = 0; i < nbPlayers; i++)
            this.alPlayers.add(new Player());
    }

    public void setPseudos(String[] pseudos)
    {
        for (int i = 0; i < pseudos.length; i++)
            this.alPlayers.get(i).setPseudo(pseudos[i]);
    }

    public Player getPlayer(int id)
    {
        for (Player p : this.alPlayers)
            if (p.getById() == id) return p;
        return null;
    }
}
