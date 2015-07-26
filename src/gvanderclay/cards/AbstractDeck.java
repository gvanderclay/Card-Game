package gvanderclay.cards;

import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Abstract class that will be used to am
 * 
 * @author Gage Vander Clay
 * 
 */
public abstract class AbstractDeck {

	private List<Card> deck;

	public abstract void fillDeck();

	public void shuffleDeck() {
		Collections.shuffle(deck);
	}

	public Card drawCard() throws NoSuchElementException {
		if (deck.isEmpty()) {
			throw new NoSuchElementException();
		}
		return deck.remove(0);
	}

	public List<Card> getDeck() {
		return deck;
	}

	public void setDeck(List<Card> deck) {
		this.deck = deck;
	}

}
