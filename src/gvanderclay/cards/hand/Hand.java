package gvanderclay.cards.hand;

import gvanderclay.cards.card.Card;


import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Represents the hand that a player will be holding
 * 
 * @author Gage Vander Clay
 * 
 */
public class Hand {

	/**
	 * List of card that are in the hand
	 */
	private List<Card> hand;

	/**
	 * Constructor that instantiates an empty deck
	 */
	public Hand() {
		hand = new ArrayList<Card>();
	}

	/**
	 * Clears the hand
	 */
	public void clear() {
		hand.clear();
	}

	/**
	 * Adds a card to the deck
	 * 
	 * @param newCard
	 *            Card to be added to the deck
	 */
	public void addCard(Card newCard) {
		if (newCard == null) {
			throw new NullPointerException("Can't add a null card to a hand");
		}
		hand.add(newCard);
	}

	/**
	 * Removes a card from a certain index in the deck
	 * 
	 * @param index
	 *            Index of the card in the deck
	 * @return The card that has been removed
	 */
	public Card removeCard(int index) {
		if (index < 0 || index >= hand.size()) {
			throw new IllegalArgumentException(
					"That position does not exist in this hand");
		}
		return hand.remove(index);
	}

	/**
	 * Removes a specific card from the deck
	 * 
	 * @param card
	 *            card to be removed from the deck
	 * @return The card that was removed
	 */
	public Card removeCard(Card card) {
		if (hand.remove(card)) {
			return card;
		}
		throw new NoSuchElementException(
				"Can't remove a card that isn't in the hand");
	}

	/**
	 * Returns the amount of cards in the deck
	 * 
	 * @return The amount of cards in the deck
	 */
	public int getCardCount() {
		return hand.size();
	}

	/**
	 * Gets a card at a certain index in the deck
	 * 
	 * @param index
	 *            Index of the card being gotten
	 * @return
	 */
	public Card getCard(int index) {
		if (index < 0 || index >= hand.size()) {
			throw new IllegalArgumentException(
					"That position does not exist in this hand");
		}

		return hand.get(index);
	}

	/**
	 * Sorts the cards in the hand by suit
	 */
	public void sortBySuit() {
		// TODO
	}

	/**
	 * Sorts the cards in the hand by value
	 */
	public void sortByValue() {
		// TODO
	}

	public static void main(String[] args) {

	}
}
