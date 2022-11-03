package com.bridgelabz;

public class DeckOfCards {
    public static void main(String[] args) {
        System.out.println("Welcome to the Deck of Cards Game ");
        final int NUMBER_OF_PLAYERS = 4;
        final int NUMBER_OF_CARDS = 9;

        Deck deckOperations = new Deck();
        System.out.println("Displaying Deck : ");
        deckOperations.printDeck();
        deckOperations.shuffleDeck();
        System.out.println("\nShuffled deck : ");
        deckOperations.printDeck();

        String[][] playerHands = new String[10][4];
        Players playerOperations = new Players();
        playerOperations.getPlayers(playerHands);
        deckOperations.deal(NUMBER_OF_PLAYERS, NUMBER_OF_CARDS, playerHands);
        System.out.println("\nDisplaying Player hands after distributing cards : \n");
        playerOperations.print(playerHands);

    }
}

