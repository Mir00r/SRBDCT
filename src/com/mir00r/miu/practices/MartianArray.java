package com.mir00r.miu.practices;

/**
 * @author mir00r on 26/3/22
 * @project IntelliJ IDEA
 */
public class MartianArray {

    public static int isMartian(int[] arr) {
        if (arr.length == 0) return 0;
        int noOfOne = 0;
        int noOfTwo = 0;
        boolean isAdjacent = false;
        for (int j : arr) {
            if (j == 1) noOfOne++;
            if (j == 2) noOfTwo++;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) {
                isAdjacent = true;
                break;
            }
        }
        return noOfOne > noOfTwo && !isAdjacent ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isMartian(new int[]{1, 3}));
        System.out.println(isMartian(new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1}));
        System.out.println(isMartian(new int[]{1, 3, 2}));
        System.out.println(isMartian(new int[]{1, 3, 2, 2, 1, 5, 1, 5}));
        System.out.println(isMartian(new int[]{1, 2, -18, -18, 1, 2}));
        System.out.println(isMartian(new int[]{}));
        System.out.println(isMartian(new int[]{1}));
        System.out.println(isMartian(new int[]{2}));
    }
}
