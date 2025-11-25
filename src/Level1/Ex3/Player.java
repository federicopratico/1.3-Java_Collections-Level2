package Level1.Ex3;

public class Player {
    private String name;
    private int score;

    public Player(String name, int score) {
        if(name == null) throw new NullPointerException();

        this.name = name;
        this.score = 0;
    }

    public void addOneToScore() {
        score++;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
