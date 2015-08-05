package gvanderclay.people.type;

import gvanderclay.cards.card.Card;
import gvanderclay.cards.hand.Hand;
import gvanderclay.people.Person;

public class Player implements Person {

	private Hand hand;

	public Player() {
		hand = new Hand();
	}

	@Override
	public Hand viewHand() {
		return this.hand;
	}

	@Override
	public Card playCard(int index) {
		return hand.removeCard(index);
	}

	@Override
	public Card playCard(Card card) {
		return hand.removeCard(card);
	}

	@Override
	public void drawCard(Card card) {
		hand.addCard(card);
	}

}
