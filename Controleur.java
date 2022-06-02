package Goorch;

import Goorch.GUI.Frame;
import Goorch.Worker.Game;

public class Controleur {
    private Frame ihm;
    private Game game;

    private Controleur()
    {
        this.ihm = new Frame(this);
    }

    public void createGame(int nbPlayers)
    {
        this.game = new Game(nbPlayers);
    }

    public void setPseudos(String[] pseudos)
    {
        this.game.setPseudos(pseudos);
        this.ihm.printStart();
    }

    public void resize()
    {
        this.ihm.resize();
    }

    public static void main(String[] args) {
        new Controleur();
    }
}