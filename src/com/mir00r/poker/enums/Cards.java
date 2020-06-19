package com.mir00r.poker.enums;

/**
 * @author mir00r on 27/5/20
 * @project IntelliJ IDEA
 */
public enum Cards {
    TWO(1, "Two", "2"), THREE(2, "Three", "3"),
    FOUR(3, "Four", "4"), FIVE(4, "Five", "5"),
    SIX(5, "Six", "6"), SEVEN(6, "Seven", "7"),
    EIGHT(7, "Eight", "8"), NINE(8, "Nine", "9"),
    TEN(9, "Ten", "T"), JACK(10, "Jack", "J"),
    QUEEN(11, "Queen", "Q"), KING(12, "King", "K"),
    ACE(13, "Ace", "A");

    private long id;
    private String name;
    private String symbol;

    Cards(long id, String name, String symbol) {
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
