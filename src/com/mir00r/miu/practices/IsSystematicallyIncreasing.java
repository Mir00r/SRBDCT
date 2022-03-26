package com.mir00r.miu.practices;

/**
 * @author mir00r on 26/3/22
 * @project IntelliJ IDEA
 */
public class IsSystematicallyIncreasing {
    public static int isSystematicallyIncreasing(int[] arr) {
        if (arr.length == 0) return 0;
        if (arr.length == 1) return 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i] || arr[i - 1] > arr[i]) return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isSystematicallyIncreasing(new int[]{1}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 2, 1, 2, 3}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 3}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 2, 1, 2, 1, 2}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 2, 3, 1, 2, 1}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 2, 3}));
    }
}
