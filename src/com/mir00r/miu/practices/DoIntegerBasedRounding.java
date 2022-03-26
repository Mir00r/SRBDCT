package com.mir00r.miu.practices;

import java.util.Arrays;

/**
 * @author mir00r on 25/3/22
 * @project IntelliJ IDEA
 */
public class DoIntegerBasedRounding {

    public static int[] doIntegerBasedRounding(int[] arr, int n) {
        if (n <= 0) return arr;
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) ans[i] = arr[i];
            else {
                int base = n * (arr[i] / n);
                ans[i] = Math.abs(arr[i] - base) < Math.abs(arr[i] - base - n) ? base : base + n;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}, 2)));
        System.out.println(Arrays.toString(doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}, 3)));
        System.out.println(Arrays.toString(doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}, -3)));
        System.out.println(Arrays.toString(doIntegerBasedRounding(new int[]{-1, -2, -3, -4, -5}, 3)));
        System.out.println(Arrays.toString(doIntegerBasedRounding(new int[]{-18, 1, 2, 3, 4, 5}, 4)));
        System.out.println(Arrays.toString(doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}, 5)));
        System.out.println(Arrays.toString(doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}, 100)));
    }
}
