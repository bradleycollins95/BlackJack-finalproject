package Cards;

/**
 * Represents a playing card with a suit and rank.
 *
 * @author bradley.collins
 */
public class PlayingCard {
    private final String suit;
    private final String rank;

    /**
     * Constructs a playing card with its specified suit and rank value
     *
     * @param suit The suit of the card (ie: Hearts, Diamonds, Clubs, Spades).
     * @param rank The rank of the card (ie: 2-10, J, Q, K, A).
     */
    public PlayingCard(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    /**
     * Returns the value of the card
     * Face cards (J, Q, K) are worth 10, Ace (A) is worth 1 (or 11)
     * Numbered cards are worth their numeric value
     *
     * @return The value of the card
     */
    public int getValue() {
        if (rank.equals("J") || rank.equals("Q") || rank.equals("K")) {
            return 10;
        } else if (rank.equals("A")) {
            return 1;
        } else {
            return Integer.parseInt(rank);
        }
    }

    /**
     * Returns the card rank and suit as a string
     *
     * @return rank and suit of a playing card as a string
     */
    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
