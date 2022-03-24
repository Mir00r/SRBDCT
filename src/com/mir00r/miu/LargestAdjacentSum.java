package com.mir00r.miu;

/**
 * @author mir00r on 24/3/22
 * @project IntelliJ IDEA
 */
public class LargestAdjacentSum {

    public static int findLargestAdjacentSum(int[] arr) {
        int maxValue = Integer.MIN_VALUE;
        if (arr.length == 2) return (arr[0] + arr[1]);
        else {
            for (int i = 1; i < arr.length; i++) {
                int sum = arr[i - 1] + arr[i];
                if (sum > maxValue) maxValue = sum;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        System.out.println(findLargestAdjacentSum(new int[]{1, 2, 3, 4}));
        System.out.println(findLargestAdjacentSum(new int[]{18, -12, 9, -10}));
        System.out.println(findLargestAdjacentSum(new int[]{1, 1, 1, 1, 1, 1, 1, 1}));
        System.out.println(findLargestAdjacentSum(new int[]{1, 1, 1, 1, 2, 1, 1, 1}));
    }
}
