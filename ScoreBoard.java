package Engine;

import java.io.Serializable;

/**
 *
 * @author Prativa Kafley
 */
public class ScoreBoard implements Serializable {

    private int score;
    private String name;

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public ScoreBoard(String name, int score) {
        this.score = score;
        this.name = name;
    }
}
