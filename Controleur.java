package Goorch;

import Goorch.GUI.Frame;
import Goorch.Worker.Game;

public class Controleur {
    private Frame ihm;
    private Game game;
    private float ratio = 1;

    private Controleur()
    {
        this.ihm = new Frame(this);
        // this.game = new Game(2);
        // String tmp[] = { "Jean", "Baptiste" };
        // this.setPseudos(tmp);
        // this.play(0, "test"      , 144400000000L, (float) 0.4);
        // this.play(1, "test num 2", 8000000  , (float) 1.5);
        // this.nextRound();
        // this.play(0, "testas"      , 8040000, (float) 0.7);
        // this.play(1, "testos", 800010000  , (float) 1.1);
        // this.nextRound();
        // this.play(0, "testis"      , 8010000, (float) 3);
        // this.play(1, "testnum 2", 800008800  , (float) 0.2);
        // this.nextRound();
        // this.play(0, "tes"      , 800900000, (float) 1);
        // this.play(1, "tet num 2", 800020  , (float) 2);
        // this.nextRound();
        // System.out.println(this.game.toString());
    }

    public void createGame(int nbPlayers)
    {
        this.game = new Game(nbPlayers);
    }

    public void setPseudos(String[] pseudos)
    {
        this.game.setPseudos(pseudos);
    }

    public void printStart()
    {
        this.ihm.printStart();
    }

    public void startGame()
    {
        this.ihm.printFirstRound();
    }

    public boolean play(int id, String word, long nbResearch, float time)
    {
        return this.game.play(id, word, nbResearch, time);
    }

    public void nextRound()
    {
        this.game.nextRound();
    }

    public boolean isLastRound()
    {
        return this.game.isLastRound();
    }

    public void resize()
    {
        this.ihm.resize();
    }

    public void setRatio(float ratio)
    {
        this.ratio = ratio;
    }

    public float getRatio()
    {
        return this.ratio;
    }

    public static void main(String[] args) {
        new Controleur();
    }
}