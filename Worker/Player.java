package Goorch.Worker;

import Goorch.Worker.Game;

public class Player {
    public static int idPlayers = 0;
    private String pseudo;
    private int id;
    private int score;

    private float   [] bonusMalus    = new float   [18];
    private int     [] scorePerRound = new int     [18];
    private int     [] scoreAtRound  = new int     [18];
    private Research[] researches    = new Research[18];

    public Player()
    {
        this.id = idPlayers++;
        this.score = 0;
        for (int i = 0; i < 18; i++)
        {
            this.bonusMalus   [i] = 1;
            this.scorePerRound[i] = 0;
            this.scoreAtRound [i] = 0;
            this.researches   [i] = null;
        }
    }

    public int calculateScore(int basicPoints  , int round) { return (int) (basicPoints * this.bonusMalus[round]); }
    public void addBonusMalus(float bonusMalus , int round) { this.bonusMalus[round] = this.bonusMalus[round] * bonusMalus; }
    public void setPseudo(String pseudo) { this.pseudo = pseudo; }
    public void addScore(int scoreToAdd, int round)
    {
        this.score+=scoreToAdd;
        this.scorePerRound[round] = scoreToAdd;
        this.scoreAtRound [round] = this.score;
    }

    public void addResearch(Research research, int round) { this.researches[round] = research; }
    // public Research getResearch(int ind) { return this.researches.get(ind); }

    public String getPseudo() { return this.pseudo; }
    public int    getScore () { return this.score;  }
    public int    getById  () { return this.id ;    }
    public int getScoreAt(int round)  { return this.scoreAtRound [round]; }
    public int getScorePer(int round) { return this.scorePerRound[round]; }
}
