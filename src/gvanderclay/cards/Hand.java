package gvanderclay.cards;

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

	private List<Card> hand;

	public Hand() {
		hand = new ArrayList<Card>();
	}

	public void clear() {
		hand.clear();
	}

	public void addCard(Card newCard) {
		if (newCard == null) {
			throw new NullPointerException("Can't add a null card to a hand");
		}
		hand.add(newCard);
	}

	public Card removeCard(int index) {
		if (index < 0 || index >= hand.size()) {
			throw new IllegalArgumentException(
					"That position does not exist in this hand");
		}
		return hand.remove(index);
	}

	public Card removeCard(Card card) {
		if (hand.remove(card)) {
			return card;
		}
		throw new NoSuchElementException(
				"Can't remove a card that isn't in the hand");
	}

	public int getCardCount() {
		return hand.size();
	}

	public Card getCard(int index) {
		if (index < 0 || index >= hand.size()) {
			throw new IllegalArgumentException(
					"That position does not exist in this hand");
		}

		return hand.get(index);
	}

	public void sortBySuit() {
		// TODO
	}

	public void sortByValue() {
		// TODO
	}
}
