package com.mir00r.miu.practices;

/**
 * @author mir00r on 26/3/22
 * @project IntelliJ IDEA
 */
public class PairedNArray {

    public static int isPairedN1(int[] a, int n) {
        if (a.length <= 1 || a.length + 1 < n || n < 0) return 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == n && i + j == n) return 1;
            }
        }
        return 0;
    }

    public static int isPairedN(int[] a, int n) {
        if (a.length <= 1 || a.length + 1 < n || n < 0) return 0;

        int i = 0;
        while (i < a.length) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == n && i + j == n) return 1;
            }
            i++;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isPairedN(new int[]{1, 4, 1, 4, 5, 6}, 5));
        System.out.println(isPairedN(new int[]{1, 4, 1, 4, 5, 6}, 6));
        System.out.println(isPairedN(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8}, 6));
        System.out.println(isPairedN(new int[]{1, 4, 1}, 5));
        System.out.println(isPairedN(new int[]{8, 8, 8, 8, 7, 7, 7}, 15));
        System.out.println(isPairedN(new int[]{8, -8, 8, 8, 7, 7, -7}, -15));
        System.out.println(isPairedN(new int[]{3}, 0));
        System.out.println(isPairedN(new int[]{}, 0));
    }
}
