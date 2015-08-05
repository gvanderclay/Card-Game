package gvanderclay.euchre;

import java.util.ArrayList;

import gvanderclay.cards.card.Card;
import gvanderclay.cards.type.data.rank.Rank;
import gvanderclay.cards.type.data.suit.Suit;

public class EuchreDeck extends gvanderclay.deck.AbstractDeck {

	private final int CARDS_PER_SUIT = 6;
	
	private final int NUMBER_OF_SUITS = 4;
	
	public EuchreDeck(){
		fillDeck();
	}
	
	@Override
	public void fillDeck() {
		this.deck = new ArrayList<Card>();
		Suit suit = Suit.SPADES;
		Rank rank = Rank.NINE;
		for(int j = 0; j < NUMBER_OF_SUITS; j++){
			for(int i = 0; i < CARDS_PER_SUIT; i++){
				if(rank == Rank.JOKER){
					rank = rank.next();
				}
				Card newCard = new Card(suit, rank);
				this.deck.add(newCard);
				rank = rank.next();
			}
			suit = suit.next();
			rank = Rank.NINE;
		}
	}
	
	public static void main(String[] args){
		EuchreDeck d = new EuchreDeck();
		System.out.println(d.toString());
	}

}
