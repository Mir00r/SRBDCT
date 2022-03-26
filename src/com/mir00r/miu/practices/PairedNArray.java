package com.mir00r.miu.practices;

/**
 * @author mir00r on 26/3/22
 * @project IntelliJ IDEA
 */
public class PairedNArray {

    public static int pairedN(int[] arr, int n) {
        if (arr.length <= 1 || arr.length + 1 < n || n < 0) return 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == n && i + j == n) return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(pairedN(new int[]{1, 4, 1, 4, 5, 6}, 5));
        System.out.println(pairedN(new int[]{1, 4, 1, 4, 5, 6}, 6));
        System.out.println(pairedN(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8}, 6));
        System.out.println(pairedN(new int[]{1, 4, 1}, 5));
        System.out.println(pairedN(new int[]{8, 8, 8, 8, 7, 7, 7}, 15));
        System.out.println(pairedN(new int[]{8, -8, 8, 8, 7, 7, -7}, -15));
        System.out.println(pairedN(new int[]{3}, 0));
        System.out.println(pairedN(new int[]{}, 0));
    }
}
