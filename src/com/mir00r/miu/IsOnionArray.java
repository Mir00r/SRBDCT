package com.mir00r.miu;

/**
 * @author mir00r on 25/3/22
 * @project IntelliJ IDEA
 */
public class IsOnionArray {


    public static int isOnionArray(int[] arr) {
        if (arr.length == 0 || arr.length == 1) return 1;

        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
//            if (i + j == arr.length) {
                if (arr[i] + arr[j] > 10) return 0;
//            }
            i++;
            j--;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isOnionArray(new int[]{1, 2, 19, 4, 5}));
        System.out.println(isOnionArray(new int[]{1, 2, 3, 4, 15}));
        System.out.println(isOnionArray(new int[]{1, 3, 9, 8}));
        System.out.println(isOnionArray(new int[]{2}));
        System.out.println(isOnionArray(new int[]{}));
        System.out.println(isOnionArray(new int[]{-2, 5, 0, 5, 12}));
    }
}
