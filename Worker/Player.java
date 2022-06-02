package Goorch.Worker;
public class Player {
    public static int idPlayers = 0;
    private String pseudo;
    private int id;
    private int score;

    private int   [] bonusMalus    = new int   [18];
    private int   [] scorePerRound = new int   [18];
    private String[] lstWords      = new String[18];

    public Player()
    {
        this.id = idPlayers++;
        this.score = 0;
        for (int i = 0; i < 18; i++)
        {
            this.bonusMalus   [i] =  1;
            this.scorePerRound[i] =  0;
            this.lstWords     [i] = "";
        }
    }

    public int calculateScore(int basicPoints, int round) { return basicPoints * this.bonusMalus[round]; }
    public void addBonusMalus(int bonusMalus , int round) { this.bonusMalus[round] = this.bonusMalus[round] * bonusMalus; }
    public void addScore(int scoreToAdd) { this.score+=scoreToAdd; }
    public void setPseudo(String pseudo) { this.pseudo = pseudo;   }

    public String getPseudo() { return this.pseudo; }
    public int    getScore () { return this.score;  }
    public int    getById  () { return this.id ;    }
}
