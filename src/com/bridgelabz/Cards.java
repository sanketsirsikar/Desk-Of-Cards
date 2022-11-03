package com.bridgelabz;

public class Cards {
    private int suit;
    private int rank;

    public Cards(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;

    }

    @Override
    public String toString() {
        return "Cards{" +
                "suit=" + suit +
                ", rank=" + rank +
                '}';
    }
}