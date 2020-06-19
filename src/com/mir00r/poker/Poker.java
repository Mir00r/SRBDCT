package com.mir00r.poker;

import java.util.Scanner;

/**
 * @author mir00r on 27/5/20
 * @project IntelliJ IDEA
 */
public class Poker {

    public void run() {
        this.getInput();
    }

    private void getInput() {
        Scanner input = new Scanner(System.in);
        int tc, x, y, n, m, sum = 0, index = 0, count = 0;
        String[] playerOne = new String[5];
        String[] playerTwo = new String[5];

        System.out.println("Enter first player cards: ");
        for (int i = 0; i < playerOne.length; i++) {
            playerOne[i] = input.nextLine();
        }

//        System.out.println("Enter second player cards: ");
//        for (int i = 0; i < playerTwo.length; i++) {
//            playerTwo[i] = input.nextLine();
//        }
    }

    private int determineWinner(String[] player1, String[] player2) {
        int winner = 0;
        return winner;
    }
}
