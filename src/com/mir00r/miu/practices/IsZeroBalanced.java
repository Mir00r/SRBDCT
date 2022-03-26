package com.mir00r.miu.practices;

/**
 * @author mir00r on 26/3/22
 * @project IntelliJ IDEA
 */
public class IsZeroBalanced {

    public static int isZeroBalance(int[] arr) {
        if (arr.length == 0 || arr.length == 1) return 0;

        int sum = 0;
        boolean negativeFlag;
        for (int k : arr) {
            negativeFlag = k <= 0;
            sum += k;
            for (int i : arr) {
                if (k > 0 && k == -i) {
                    negativeFlag = true;
                    break;
                }
            }
            if (!negativeFlag)
                return 0;
        }
        return sum == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isZeroBalance(new int[]{1, 2, -2, -1}));
        System.out.println(isZeroBalance(new int[]{-3, 1, 2, -2, -1, 3}));
        System.out.println(isZeroBalance(new int[]{3, 4, -2, -3, -2}));
        System.out.println(isZeroBalance(new int[]{0, 0, 0, 0, 0, 0}));
        System.out.println(isZeroBalance(new int[]{3, -3, -3}));
        System.out.println(isZeroBalance(new int[]{3}));
        System.out.println(isZeroBalance(new int[]{}));
    }
}
