package Cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a standard deck of 52 playing cards. [2 - 10, J, Q, K, A]
 *
 * @author bradley.collins
 */
public class DeckOfCards {
    private final List<PlayingCard> deck;
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

    /**
     * Constructs, initializes, and shuffles the 52 card deck
     */
    public DeckOfCards() {
        deck = new ArrayList<>();
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                deck.add(new PlayingCard(suit, rank));
            }
        }
        shuffle();
    }

    /**
     * Manually shuffles the deck of cards
     */
    public void shuffle() {
        Collections.shuffle(deck);
    }

    /**
     * Draws a card from the top of the deck
     *
     * @return The drawn card
     */
    public PlayingCard drawCard() {
        if (deck.isEmpty()) {
            throw new IllegalStateException("The deck is empty.");
        }
        return deck.remove(deck.size() - 1);
    }

    @Override
    public String toString() {
        return deck.toString();
    }
}
