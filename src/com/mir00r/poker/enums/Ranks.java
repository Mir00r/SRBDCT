package com.mir00r.poker.enums;

/**
 * @author mir00r on 27/5/20
 * @project IntelliJ IDEA
 */
public enum Ranks {
    HIGH_CARD(1, "Highest value card", "HC"),
    ONE_PAIR(2, "Two cards of the same value", "OP"),
    TWO_PAIRS(3, "Two different pairs", "TP"),
    THREE_OF_A_KIND(4, "Three cards of the same value", "TOK"),
    STRAIGHT(5, "All cards are consecutive values", "STR"),
    FLUSH(6, "All cards of the same suit", "FL"),
    FULL_HOUSE(7, "Three of a kind and a pair", "FH"),
    FOUR_OF_A_KIND(8, "Four cards of the same value", "FOK"),
    STRAIGHT_FLUSH(9, "All cards are consecutive values of same suit", "SF"),
    ROYAL_FLUSH(10, "Ten, Jack, Queen, King, Ace in same suit", "RF");

    private long id;
    private String name;
    private String symbol;

    Ranks(long id, String name, String symbol) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
