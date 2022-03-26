package com.mir00r.miu.practices;

/**
 * @author mir00r on 25/3/22
 * @project IntelliJ IDEA
 */
public class DigitEncoder {

    public static int digitEncoder(int[] arr) {
        if (arr.length == 0) return 0;
        int digitMultiply = 0;
        for (int i = 1; i < arr.length; i++) {
            int differenceDigit = Math.abs(arr[i - 1] - arr[i]);
            digitMultiply = digitMultiply * 10 + differenceDigit;
        }
        return arr[0] < 0 ? (-1) * digitMultiply : digitMultiply;
    }

    public static void main(String[] args) {
        System.out.println(digitEncoder(new int[]{0, -3, 0, -4, 0}));
        System.out.println(digitEncoder(new int[]{-1, 5, 8, 17, 15}));
        System.out.println(digitEncoder(new int[]{1, 5, 8, 17, 15}));
        System.out.println(digitEncoder(new int[]{111, 115, 118, 127, 125}));
        System.out.println(digitEncoder(new int[]{}));
        System.out.println(digitEncoder(new int[]{1, 1}));
    }
}
