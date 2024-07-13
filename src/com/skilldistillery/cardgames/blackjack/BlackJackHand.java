package com.skilldistillery.cardgames.blackjack;

import com.skilldistillery.cardgames.common.AbstractHand;
import com.skilldistillery.cardgames.common.Card;

public class BlackJackHand extends AbstractHand {

	//HAS NO FIELDS
	
	BlackJackHand(){
		
	}
	
	@Override
	public int getHandValue() {
		int totalValue = 0;
		for (Card card : cardsInHand) {
		totalValue += card.getValue();
		}
		return totalValue;
	}
	
	//TODO add other methods in this class
	
	public boolean isBlackJack() {
		return false;
		
	}
	
	public boolean isBust() {
		return false;
		
	}
	

}
