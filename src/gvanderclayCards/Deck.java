package gvanderclayCards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Class that represents a deck of cards
 * 
 * @author Gage Vander Clay
 * 
 */
public class Deck {

	/**
	 * Array of cards that represents the deck
	 */
	private List<Card> deck;

	/**
	 * Size of a deck that does not contain any jokers
	 */
	private final int STAN_DECK_SIZE = 52;

	/**
	 * Size of a deck that contains jokers
	 */
	private final int JOKER_DECK_SIZE = 54;

	/**
	 * Standard constructor
	 * 
	 * @param hasJokers
	 *            if this is true it constructs a deck that contains jokers, if
	 *            it is false it constructs a deck that does not contain jokers
	 */
	public Deck(boolean hasJokers) {
		deck = initDeck(hasJokers);
	}

	/**
	 * Creates a full deck
	 * 
	 * @param hasJoker
	 *            if this is true it constructs a deck that contains jokers, if
	 *            it is false it constructs a deck that does not contain jokers
	 * @return a full deck of cards
	 */
	private List<Card> initDeck(boolean hasJoker) {
		List<Card> deck = new ArrayList<Card>();
		// set the initial card
		Suit suit = Suit.SPADES;
		Rank rank = Rank.ACE;
		// loop that goes through each suit and rank
		for (int i = 0; i < STAN_DECK_SIZE; i++) {
			// makes sure to not put weird jokers in the deck
			if (i % 13 == 0) {
				suit = suit.next();
				rank = Rank.ACE;
			}
			deck.add(new Card(suit, rank));
			rank = rank.next();
		}
		// puts the jokers in the deck
		if (hasJoker) {
			deck.add(new Card(Suit.SPADES, Rank.JOKER));
			deck.add(new Card(Suit.SPADES, Rank.JOKER));
		}
		return deck;
	}

	/**
	 * shuffles the deck
	 */
	private void shuffleDeck() {
		Collections.shuffle(deck);
	}

	/**
	 * Draws a card from the top of the pile and decrements the amount of cards
	 * in the deck
	 * 
	 * @return the card that is drawn
	 */
	private Card drawCard() throws NoSuchElementException {
		if (deck.isEmpty()) {
			throw new NoSuchElementException();
		}
		return deck.remove(0);
	}

	/**
	 * Prints out the deck
	 */
	private void printDeck() {
		for (int i = 0; i < deck.size(); i++) {
			System.out.println(deck.get(i).toString());
		}
	}

	public static void main(String[] args) {
		Deck d = new Deck(false);
		d.shuffleDeck();
		d.printDeck();
		System.out.println("\n" + d.drawCard().toString() + "\n");
		d.printDeck();
	}
}
