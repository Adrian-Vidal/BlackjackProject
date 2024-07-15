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
		System.out.println();
		System.out.println("Player's hand:");
		player.displayHand();
		System.out.println();

		if (player.isBlackJack() && dealer.isBlackJack()) {
			System.out.println("\nBoth player and dealer have Blackjack! It's a tie!");
			return;
		} else if (player.isBlackJack()) {
			System.out.println("\nPlayer has Blackjack! Player wins!");
			return;
		} else if (dealer.isBlackJack()) {
			System.out.println("\nDealer has Blackjack! Dealer wins!");
			return;
		}

		boolean playerBust = false;
		while (true) {
			System.out.println("Enter h to hit or s to stand.\n");
			String userSelection = keyboard.nextLine();
			if (userSelection.equalsIgnoreCase("h")) {
				player.addCardToHand(dealer.dealCard());
				System.out.println();
				player.displayHand();
				System.out.println();
				if (player.getHandValue() > 21) {
					System.out.println("Player busts, dealer wins!");
					playerBust = true;
					break;
				}
			} else if (userSelection.equalsIgnoreCase("s")) {
				System.out.println();
				break;
			} else {
				System.out.println("\nInvalid selection. Please enter H or S.\n");
			}
		}

		if (!playerBust) {
			while (dealer.getHandValue() < 17) {
				dealer.addCardToHand(dealer.dealCard());
				dealer.displayHand();
				System.out.print("Dealer's hand: " + dealer.getHandValue() + "\n");  
			}

			if (dealer.getHandValue() > 21) {
				System.out.println("\nDealer busts, player wins!");
			} else {
				int playerValue = player.getHandValue();
				int dealerValue = dealer.getHandValue();

				System.out.println("\nDealer's hand: " + dealerValue);
				System.out.println("Player's hand: " + playerValue);

				if (playerValue > dealerValue) {
					System.out.println("Player wins!");
				} else if (playerValue < dealerValue) {
					System.out.println("Dealer wins!");
				} else {
					System.out.println("Tie!");
				}
			}
		}

		keyboard.close();
	}
}
