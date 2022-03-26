package com.mir00r.miu.practices;

/**
 * @author mir00r on 26/3/22
 * @project IntelliJ IDEA
 */
public class Is123Array {

    public static int isArray(int[] arr) {
        int two = 2;
        int three = 3;
        int five = 5;

        int twoDivisibleCount = 0;
        int threeDivisibleCount = 0;
        int fiveDivisibleCount = 0;
        int notDivisibleCount = 0;

        for (int j : arr) {
            if (j % two == 0) twoDivisibleCount++;
            if (j % three == 0) threeDivisibleCount++;
            if (j % five == 0) fiveDivisibleCount++;
            if (j % two != 0 && j % three != 0 && j % five != 0) notDivisibleCount++;
        }
        return (twoDivisibleCount + threeDivisibleCount + fiveDivisibleCount + notDivisibleCount) == arr.length ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isArray(new int[]{2, 3, 5, 7, 11}));
        System.out.println(isArray(new int[]{2, 3, 6, 7, 11}));
        System.out.println(isArray(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(isArray(new int[]{2, 4, 8, 16, 32}));
        System.out.println(isArray(new int[]{3, 9, 27, 7, 1, 1, 1, 1, 1}));
        System.out.println(isArray(new int[]{7, 11, 77, 49}));
        System.out.println(isArray(new int[]{2}));
        System.out.println(isArray(new int[]{}));
        System.out.println(isArray(new int[]{7, 2, 7, 2, 7, 2, 7, 2, 3, 7, 7}));
    }
}
