package gvanderclay.deck.impl;


import gvanderclay.cards.card.Card;
import gvanderclay.cards.type.data.rank.Rank;
import gvanderclay.cards.type.data.suit.Suit;

import java.util.ArrayList;




/**
 * Class that represents a standard deck of cards with no jokers
 * @author Gage Vander Clay
 *
 */
public class StandardDeck extends gvanderclay.deck.AbstractDeck {

	/**
	 * Maximum size of the deck
	 */
	private final int DECK_SIZE = 52;

	/**
	 * Constructor that fills the deck
	 */
	public StandardDeck() {
		fillDeck();
	}

	/* (non-Javadoc)
	 * @see gvanderclay.cards.AbstractDeck#fillDeck()
	 */
	@Override
	public void fillDeck() {
		this.deck = new ArrayList<Card>();
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
			this.deck.add(new Card(suit, rank));
			rank = rank.next();
		}
	}

}
