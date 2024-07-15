package com.skilldistillery.cardgames.blackjack;

import com.skilldistillery.cardgames.common.Card;
import com.skilldistillery.cardgames.common.Deck;

public class Dealer extends Player {
	
	//Already has a hand b/c dealer extends player
	//DO NOT ADD another hand
	//DO NOT ADD A getDeck();
	
	private Deck deck;
	
	public Dealer() {
		super();
		deck = new Deck();
	}
	//TODO add dealer specific behaviors
	//public Card dealCard() {}
	public Card dealCard() {
	return deck.dealCard();
}

	public void shuffle() {
		deck.shuffle();
	}
	
	
	
}
