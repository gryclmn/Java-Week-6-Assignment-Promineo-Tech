import java.util.ArrayList;
import java.util.List;

public class Player {

    /*
     * ********************
     * Step 1
     * ********************
     */
    private List<Card> hand = new ArrayList<Card>();
    private int score;
    private String name;

    public Player() {
        score = 0;
    }

    public Player(String newName) {
        name = newName;
        score = 0;
    }

    public void describe() {
        System.out.printf("Player %s has the following cards: \n", name);
        for (Card card : hand) {
            card.describe();
        }
    }

    public Card flip() {
        return hand.remove(0);
    }

    public void draw(Deck deck) {
        hand.add(deck.draw());
    }

    public void incrementScore() {
        score++;
    }

    public int getScore() {
        return score;
    }

}
