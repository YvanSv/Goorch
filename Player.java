public class Player {
    public int numPlayer;
    private static int idPlayers = 0;

    public Player()
    {
        this.numPlayer = idPlayers++;
    }
}
