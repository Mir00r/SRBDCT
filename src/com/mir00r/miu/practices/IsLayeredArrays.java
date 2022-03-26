package com.mir00r.miu.practices;

import java.util.LinkedHashMap;

/**
 * @author mir00r on 26/3/22
 * @project IntelliJ IDEA
 */
public class IsLayeredArrays {

    public static int isLayered(int[] arr) {
        if (arr.length <= 1) return 0;
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) return 0;
            if (arr[i - 1] == arr[i]) count++;
            if (arr[i - 1] != arr[i]) {
                if (count < 2) return 0;
                count = 1;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isLayered(new int[]{1, 1, 2, 2, 2, 3, 3}));
        System.out.println(isLayered(new int[]{3, 3, 3, 3, 3, 3, 3}));
        System.out.println(isLayered(new int[]{1, 2, 2, 2, 3, 3}));
        System.out.println(isLayered(new int[]{2, 2, 2, 3, 3, 1, 1}));
        System.out.println(isLayered(new int[]{2}));
        System.out.println(isLayered(new int[]{}));
    }
}
