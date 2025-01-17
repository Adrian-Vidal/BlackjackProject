package com.skilldistillery.cardgames.common;


//FIELDS
public class Card {
private Rank rank;
private Suit suit;

//CONSTRUCTORS
public Card(Rank rank, Suit suit) {
	this.rank = rank;
	this.suit = suit;
}
//GETTERS SETTERS
public int getValue() {
	return rank.getValue();
}



//OTHER METHODS



//HASHCODE AND EQUALS
@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((rank == null) ? 0 : rank.hashCode());
    result = prime * result + ((suit == null) ? 0 : suit.hashCode());
    return result;
  }
@Override
public boolean equals(Object obj) {
  if (this == obj)
    return true;
  if (obj == null)
    return false;
  if (getClass() != obj.getClass())
    return false;
  Card other = (Card) obj;
  if (rank != other.rank)
    return false;
  if (suit != other.suit)
    return false;
  return true;
}	


//TOSTRING
@Override
public String toString() {
	return rank + " of " + suit;
	
}
}

