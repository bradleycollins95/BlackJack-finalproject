package Players;

import Cards.PlayingCard;

import java.util.ArrayList;
import java.util.List;

/**
 * Creates a hand for the player to "hold" cards drawn from the deck of cards
 *
 * @author bradley.collins
 */
public class Hand {
    protected List<PlayingCard> cards;

    /**
     * Creates an empty hand for the players
     */
    public Hand() {
        cards = new ArrayList<>();
    }

    /**
     * Adds a card to the hand by removing the first index of the deck [0]
     *
     * @param card the first index of the deck removed and added to the player's hand
     */
    public void addCard(PlayingCard card) {
        cards.add(card);
    }

    /**
     * Clears the hand by removing all cards from them
     */
    public void clear() {
        cards.clear();
    }

    /**
     * Shows the current cards in hand
     *
     * @return The list of cards in the hand.
     */
    public List<PlayingCard> getCards() {
        return cards;
    }

    /**
     * Calculates the total value of the hand
     * Aces are counted as 1 unless counting as 11 would not cause the hand to bust
     *
     * @return The total value of the hand
     */
    public int handValue() {
        int value = 0;
        int aceCount = 0;
        for (PlayingCard card : cards) {
            value += card.getValue();
            if (card.toString().startsWith("A")) {
                aceCount++;
            }
        }
        while (aceCount > 0 && value <= 11) {
            value += 10; //count the ace as 11 instead of 1
            aceCount--;
        }
        return value;
    }

    @Override
    public String toString() {
        return cards.toString();
    }
}
