package com.mir00r.miu.practices;

/**
 * @author mir00r on 26/3/22
 * @project IntelliJ IDEA
 */
public class LoopSum {

    public static int loopSum(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i == arr.length) {
                n -= i;
                i = 0;
            }
//            System.out.println("Index: " + i);
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(loopSum(new int[]{1, 2, 3}, 2));
        System.out.println(loopSum(new int[]{-1, 2, -1}, 7));
        System.out.println(loopSum(new int[]{1, 4, 5, 6}, 4));
        System.out.println(loopSum(new int[]{3}, 10));
    }
}
