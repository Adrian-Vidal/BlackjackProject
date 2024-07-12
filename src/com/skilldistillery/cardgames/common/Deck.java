package com.skilldistillery.cardgames.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cards;

	public Deck() {
		resetDeck();
	}

	private List<Card> resetDeck() {
		cards = new ArrayList<>();
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				cards.add(new Card(rank, suit));
			}
		}
		return cards;
	}

	public int checkDeckSize() {
		return cards.size();
	}

	public boolean isEmpty() {
		if (this.cards.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}

	public Card dealCard() {
		return cards.remove(0);
	}

}