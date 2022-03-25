package com.mir00r.miu;

/**
 * @author mir00r on 26/3/22
 * @project IntelliJ IDEA
 */
public class LargestDifferenceOfEvens {

    public static int largestDifferenceOfEvens(int[] arr) {
        int evenCount = 0;
        for (int j : arr) {
            if (j % 2 == 0) evenCount++;
        }
        if (evenCount == 0 || evenCount == 1) return -1;

        int largestDiff = 0;
        boolean evenFlag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] % 2 == 0) {
                        evenFlag = true;
                        int diff = arr[i] > arr[j] ? arr[i] - arr[j] : arr[j] - arr[i];
                        largestDiff = Math.max(diff, largestDiff);
                    }
                }
            }
            if (!evenFlag && i == arr.length - 1)
                return -1;
        }
        return largestDiff;
    }

    public static void main(String[] args) {
        System.out.println(largestDifferenceOfEvens(new int[]{1, 3, 5, 9}));
        System.out.println(largestDifferenceOfEvens(new int[]{1, 18, 5, 7, 33}));
        System.out.println(largestDifferenceOfEvens(new int[]{2, 2, 2, 2}));
        System.out.println(largestDifferenceOfEvens(new int[]{1, 2, 1, 2, 1, 4, 1, 6, 4}));
    }
}
