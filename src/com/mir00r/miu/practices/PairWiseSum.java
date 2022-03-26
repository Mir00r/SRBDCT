package com.mir00r.miu.practices;

import java.util.Arrays;

/**
 * @author mir00r on 26/3/22
 * @project IntelliJ IDEA
 */
public class PairWiseSum {

    public static int[] pairWiseSum(int[] arr) {
        if (arr.length == 0 || arr.length % 2 != 0) return null;

        int[] ans = new int[arr.length / 2];
        int index = 0;
        for (int i = 1; i < arr.length; i += 2) {
            int num = arr[i - 1] + arr[i];
            if (num % 2 != 0 && index <= ans.length)
                ans[index++] = num;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(pairWiseSum(new int[]{2, 1, 18, -5})));
        System.out.println(Arrays.toString(pairWiseSum(new int[]{2, 1, 18, -5, -5, -15, 0, 0, 1, -1})));
        System.out.println(Arrays.toString(pairWiseSum(new int[]{2, 1, 18})));
        System.out.println(Arrays.toString(pairWiseSum(new int[]{})));
    }
}
