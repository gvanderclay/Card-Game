package gvanderclay.cards.type.data.suit;

/**
 * Enums of the card suits
 * 
 * @author AIUBUE1
 * 
 */
public enum Suit {

	SPADES, DIAMONDS, HEARTS, CLUBS;

	public Suit next() {
		switch (ordinal()) {
		case 0:
			return HEARTS;
		case 1:
			return SPADES;
		case 2:
			return CLUBS;
		default:
			return DIAMONDS;
		}
	}
}
