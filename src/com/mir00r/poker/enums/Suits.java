package com.mir00r.poker.enums;

/**
 * @author mir00r on 27/5/20
 * @project IntelliJ IDEA
 */
public enum Suits {

    SPADES(1, "Spades", "S"), HEART(2, "Heart", "H"),
    DIAMOND(3, "Diamond", "D"), CLUB(4, "Club", "C");

    private long id;
    private String name;
    private String symbol;

    Suits(long id, String name, String symbol) {
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
