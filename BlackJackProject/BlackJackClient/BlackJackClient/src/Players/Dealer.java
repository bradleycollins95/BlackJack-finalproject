package Players;

import Cards.DeckOfCards;

/**
 * Represents the dealer in the game of Blackjack
 *
 * @author bradley.collins
 */
public class Dealer extends Hand {

    /**
     * Dealer plays their turn according to the rules
     * The dealer must hit until their hand's value is at least 17
     */
    public void hit(DeckOfCards deck) {
        while (handValue() < 17) {
            System.out.println("Dealer hits!");
            addCard(deck.drawCard());
        }
    }
}
