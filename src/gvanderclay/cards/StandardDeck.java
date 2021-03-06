package gvanderclay.cards;

import java.util.ArrayList;
import java.util.List;


/**
 * Class that represents a standard deck of cards with no jokers
 * @author Gage Vander Clay
 *
 */
public class StandardDeck extends AbstractDeck {

	/**
	 * Maximum size of the deck
	 */
	private final int DECK_SIZE = 52;

	/**
	 * Constructor that fills the deck
	 */
	public StandardDeck() {
		super();
	}

	/* (non-Javadoc)
	 * @see gvanderclay.cards.AbstractDeck#fillDeck()
	 */
	@Override
	public void fillDeck() {
		List<Card> deck = new ArrayList<Card>();
		// set the initial card
		Suit suit = Suit.SPADES;
		Rank rank = Rank.ACE;
		// loop that goes through each suit and rank
		for (int i = 0; i < DECK_SIZE; i++) {
			// makes sure to not put jokers in the deck
			if (i % 13 == 0) {
				suit = suit.next();
				rank = Rank.ACE;
			}
			deck.add(new Card(suit, rank));
			rank = rank.next();
		}
	}

}
