package com.skilldistillery.cardgames.blackjack.app;

import java.util.Scanner;

import com.skilldistillery.cardgames.blackjack.Dealer;
import com.skilldistillery.cardgames.blackjack.Player;

public class BlackJackApp {

	// **** NO List<Cards> ****
	// **** NO Deck ****
	// Will get returned back for re-submission

	private Player player = new Player();
	private Dealer dealer = new Dealer();

	public static void main(String[] args) {
		BlackJackApp app = new BlackJackApp();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to SD44 blackjack. Press enter to play.");
		keyboard.nextLine();

		app.playGame(keyboard);
		
	}

	private void playGame(Scanner keyboard) {
		dealer.shuffle();
		
		dealer.addCardToHand(dealer.dealCard());
		dealer.addCardToHand(dealer.dealCard());

		player.addCardToHand(dealer.dealCard());
		player.addCardToHand(dealer.dealCard());

		System.out.println("Dealer's hand:");
		dealer.displayHand();

		System.out.println("Player's hand:");
		player.displayHand();
		
		
		keyboard.close();
	}
}


