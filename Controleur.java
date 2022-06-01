/**
 * Controleur
 */
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

    public static void main(String[] args) {
        new Controleur();
    }
}