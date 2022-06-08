package Goorch.Worker;
import java.util.ArrayList;

public class Game {
    private ArrayList<Player> alPlayers = new ArrayList<Player>();
    private ArrayList<Research> everyResearches = new ArrayList<Research>();
    private boolean lastRound = false;
    private int numRound = 1;

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

    private Player getPlayer(int id)
    {
        for (Player p : this.alPlayers)
            if (p.getById() == id) return p;
        return null;
    }

    public boolean play(int id, String word, long nbResearch, float time)
    {
        if (this.hasBeenResearched(word)) return false;

        Player player = this.getPlayer(id);
        Research research = new Research(word, nbResearch, time);

        player.addResearch(research, this.numRound);
        player.addScore(player.calculateScore(research.getScore(), this.numRound), this.numRound);

        return true;
    }

    private boolean hasBeenResearched(String word)
    {
        for (Research research : this.everyResearches)
            if (research.getWord().equals(word)) return true;
        return false;
    }

    public void addBonusMalus(int id, int round, float bonusMalus)
    {
        this.alPlayers.get(id).addBonusMalus(bonusMalus, round);
    }

    public void nextRound()
    {
        this.numRound++;
        if (this.numRound == 18) this.lastRound = true;
    }

    public boolean isLastRound()
    {
        return this.lastRound;
    }

    public String toString()
    {
        String sRet = "";

        for (Player p : this.alPlayers)
        {
            sRet += p.getById() + ". " + p.getPseudo() + " (" + p.getScore() + ") :\n";
            sRet += "Score at round : ";
            for (int i = 1; i < this.numRound; i++)
            {
                sRet += i + " = " + p.getScoreAt(i) + " et " + p.getScorePer(i) + " | ";
            }
            sRet = sRet.substring(0,sRet.length() - 2);
            sRet += "\n";
        }
        return sRet;
    }
}
