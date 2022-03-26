package com.mir00r.miu.practices;

/**
 * @author mir00r on 26/3/22
 * @project IntelliJ IDEA
 */
public class OneBalanceArray {

    public static int isBalance(int[] a) {
        if (a.length == 0) return 1;

        int total1s = 0;
        int totalNon1s = 0;
        boolean non1Start = false;
        boolean non1End = false;
        for (int number : a) {
            if (number == 1) {
                if (non1Start) non1End = true;
                total1s++;
            } else {
                if (non1End) return 0;
                non1Start = true;
                totalNon1s++;
            }
        }
        return total1s != totalNon1s ? 0 : 1;
    }

    public static void main(String[] args) {
        System.out.println(isBalance(new int[]{1, 1, 1, 2, 3, -18, 45, 1}));
        System.out.println(isBalance(new int[]{1, 1, 1, 2, 3, -18, 45, 1, 0}));
        System.out.println(isBalance(new int[]{1, 1, 2, 3, 1, -18, 26, 1}));
        System.out.println(isBalance(new int[]{}));
        System.out.println(isBalance(new int[]{3, 4, 1, 1}));
        System.out.println(isBalance(new int[]{1, 1, 3, 4}));
        System.out.println(isBalance(new int[]{3, 3, 3, 3, 3, 3}));
        System.out.println(isBalance(new int[]{1, 1, 1, 1, 1, 1}));
    }
}
