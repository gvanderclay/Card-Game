package gvanderclay.cards.card;

import gvanderclay.cards.type.data.rank.Rank;
import gvanderclay.cards.type.data.suit.Suit;

/**
 * Class that represents a card that will go in a deck
 * 
 * @author Gage Vander Clay
 * 
 */
public class Card {

	/**
	 * Suit of the card
	 */
	private Suit suit;

	/**
	 * Rank of the card
	 */
	private Rank rank;

	/**
	 * Simple constructor that sets the suit and rank of the card
	 * 
	 * @param suit
	 * @param rank
	 */
	public Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}

	/**
	 * @return the suit of the card
	 */
	public Suit getSuit() {
		return suit;
	}

	/**
	 * Sets the suit of the card
	 * @param suit suit of the card being set
	 */
	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	/**
	 * @return rank of the card
	 */
	public Rank getRank() {
		return rank;
	}

	/**
	 * Sets the rank of the card
	 * @param rank rank of the card being set
	 */
	public void setRank(Rank rank) {
		this.rank = rank;
	}

	/**
	 * @return true if the card is a joker false if it is not
	 */
	public boolean isJoker() {
		return this.rank == Rank.JOKER;
	}

	public String toString() {
		return rank.toString() + " of " + suit.toString();
	}
}
