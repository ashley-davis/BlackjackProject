package com.skilldistillery.common.cards;

public enum Suit {//create a public enum called Suit
HEARTS("Hearts"), SPADES("Spades"), CLUBS("Clubs"), DIAMONDS("Diamonds");
private String name;//add a private name field

Suit(String name) {
	this.name = name;
}

@Override//does nothing on its own. Identifies typos
public String toString() {
	return name;
}

}
