package Players;

/**
 * Represents the player in the game of Blackjack
 *
 * @author bradley.collins
 */
public class Player extends Hand {
    private int money;

    /**
     * Constructs a Player with a specified starting balance ($)
     *
     * @param initialBalance The initial amount of money the player has
     */
    public Player(int initialBalance) {
        this.money = initialBalance;
    }

    /**
     * Retrieves the current amount of money the player has
     *
     * @return The player's current balance
     */
    public int currentBalance() {
        return money;
    }

    /**
     * Updates the player's money based on the outcome of the game
     *
     * @param amount The amount of money to add or subtract from the player's balance
     */
    public void newBalance(int amount) {
        money += amount;
    }
}
