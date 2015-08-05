package gvanderclay.people;

import gvanderclay.cards.hand.Hand;
import gvanderclay.cards.card.Card;

public interface Person {
	/**
	 * View the hand of the person
	 * 
	 * @return
	 */
	public Hand viewHand();

	/**
	 * Plays a card at a certain point in the persons hand
	 * 
	 * @param index
	 * @return Card that was played
	 */
	public Card playCard(int index);
	
	/**
	 * Plays a specific card from the persons hand
	 * @param card Card to be played
	 * @return Card that was played
	 */
	public Card playCard(Card card);

	/**
	 * Puts a card into the persons hand
	 * 
	 * @param card Card being put into the hand
	 */
	public void drawCard(Card card);
}
