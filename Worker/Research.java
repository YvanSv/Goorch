package Goorch.Worker;

public class Research {
    private String word;
    private long nbResearch;
    private float time;
    private int score;

    public Research(String word, long nbResearch, float time)
    {
        this.word = word;
        this.nbResearch = nbResearch;
        this.time = time;

        this.score = (int) (this.nbResearch / this.time / 1000000);
    }

    public String getWord()
    {
        return this.word;
    }

    public int getScore()
    {
        return this.score;
    }
}
