package gvanderclay.cards;

import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Abstract class that will be used to make different types of decks
 * 
 * @author Gage Vander Clay
 * 
 */
public abstract class AbstractDeck {

	/**
	 * Constructs a new deck and fills the deck
	 */
	public AbstractDeck() {
		fillDeck();
	}

	/**
	 * List of cards that will hold the deck
	 */
	private List<Card> deck;

	/**
	 * Method that will fill the card with the correct cards based on what game
	 * is being played
	 */
	public abstract void fillDeck();

	/**
	 * Shuffles the deck
	 */
	public void shuffleDeck() {
		Collections.shuffle(deck);
	}

	/**
	 * Draws a card from the top of the deck
	 * @return the top card of the deck
	 * @throws NoSuchElementException if there are no cards left in the deck+
	 */
	public Card drawCard() throws NoSuchElementException {
		if (deck.isEmpty()) {
			throw new NoSuchElementException();
		}
		return deck.remove(0);
	}

	/**
	 * Gets the list of cards
	 * @return the list of cards
	 */
	public List<Card> getDeck() {
		return deck;
	}

	/**
	 * Sets the deck 
	 * @param deck the deck being set
	 */
	public void setDeck(List<Card> deck) {
		this.deck = deck;
	}
	
	/**
	 * Returns how many cards are left in the deck
	 * @return how many cards are in the deck
	 */
	public int cardsLeft(){
		return deck.size();
	}

}
