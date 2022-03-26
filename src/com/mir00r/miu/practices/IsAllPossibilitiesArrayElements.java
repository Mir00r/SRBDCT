package com.mir00r.miu.practices;

/**
 * @author mir00r on 26/3/22
 * @project IntelliJ IDEA
 */
public class IsAllPossibilitiesArrayElements {

    public static int isAllPossible(int[] arr) {
        if (arr.length == 0) return 0;
        if (arr.length == 1) return 1;
        int inclusiveLen = arr.length - 1;
        int inclusiveLenSum = inclusiveLen * (inclusiveLen + 1) / 2;
        int lenSum = 0;
        for (int j : arr) {
            lenSum += j;
        }
        return lenSum == inclusiveLenSum ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isAllPossible(new int[]{1, 2, 0, 3}));
        System.out.println(isAllPossible(new int[]{3, 2, 1, 0}));
        System.out.println(isAllPossible(new int[]{1, 2, 3, 4}));
        System.out.println(isAllPossible(new int[]{0, 2, 3}));
        System.out.println(isAllPossible(new int[]{0}));
        System.out.println(isAllPossible(new int[]{}));
    }
}
