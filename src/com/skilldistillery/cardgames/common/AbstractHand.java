package com.skilldistillery.cardgames.common;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractHand {

	//DO NOT ADD get CardsHand() method
	protected List<Card> cardsInHand;
		
	public AbstractHand() {
		this.cardsInHand = new ArrayList<>();
	}
	
	public abstract int getHandValue();
	
	//TODO addCard(Card card) and clearHand() need to be added
	
	
}
