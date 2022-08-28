package com.mir00r.coderbyte;

import java.util.Scanner;

/**
 * @author mir00r on 26/8/22
 * @project IntelliJ IDEA
 */
public class CoinDeterminer {

    public static int coinDeterminer(int num) {
        // code goes here
        if (num == 0) return 0;
        int maxn = Integer.MAX_VALUE;
        int[] coins = {1, 5, 7, 9, 11};
        for (int coin : coins) {
            if (coin <= num) {
                int subMaxn = coinDeterminer(num - coin);
                // Check for INT_MAX to avoid overflow and see if
                // result can minimized
                if (subMaxn != Integer.MAX_VALUE && subMaxn + 1 < maxn)
                    maxn = subMaxn + 1;
            }
        }
        return maxn;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(coinDeterminer(s.nextInt()));
    }
}
