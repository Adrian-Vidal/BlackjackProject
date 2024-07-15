package com.skilldistillery.cardgames.blackjack;

import com.skilldistillery.cardgames.common.Card;

public class Player {

	//Player HAS-A Hand
	//DO NOT ADD A getHand();
	private BlackJackHand hand;
	//NO List<Card>, hand has one

	public Player() {
		this.hand = new BlackJackHand();
	}

	public void addCardToHand(Card card) {
		hand.addCard(card);
	}
	
	public int getHandValue() {
		return hand.getHandValue();
	}
	
	public void displayHand() {
		System.out.println(hand);
	}
	
	public boolean isBlackJack() {
		return hand.isBlackJack();
	}
	
	public boolean isBust() {
		return hand.isBust();
	}
			
}
