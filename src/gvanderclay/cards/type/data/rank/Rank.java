package gvanderclay.cards.type.data.rank;

/**
 * Enums of the card Ranks
 * 
 * @author Gage Vander Clay
 * 
 */
public enum Rank {

	JOKER, ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;

	public Rank next() {
		switch (ordinal()) {
		case 0:
			return ACE;
		case 1:
			return TWO;
		case 2:
			return THREE;
		case 3:
			return FOUR;
		case 4:
			return FIVE;
		case 5:
			return SIX;
		case 6:
			return SEVEN;
		case 7:
			return EIGHT;
		case 8:
			return NINE;
		case 9:
			return TEN;
		case 10:
			return JACK;
		case 11:
			return QUEEN;
		case 12:
			return KING;
		default:
			return JOKER;
		}
	}
}
